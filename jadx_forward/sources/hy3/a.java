package hy3;

/* loaded from: classes7.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.lang.String a(android.content.Context context, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (str == null) {
            return "";
        }
        if (str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosUtils", "sha256 is empty");
            return "";
        }
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("(?i)(([a-f0-9]{2}:){5})[a-f0-9]{2}");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
        if (compile.matcher(str).find()) {
            return str;
        }
        if (android.os.Build.VERSION.SDK_INT < 31 || b3.l.m9698x3fed0563(context, "android.permission.BLUETOOTH_CONNECT") == 0) {
            java.lang.Object systemService = context.getSystemService("bluetooth");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.bluetooth.BluetoothManager");
            java.util.Set<android.bluetooth.BluetoothDevice> bondedDevices = ((android.bluetooth.BluetoothManager) systemService).getAdapter().getBondedDevices();
            if (bondedDevices != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosUtils", "convertMac devices.size=" + bondedDevices.size());
                for (android.bluetooth.BluetoothDevice bluetoothDevice : bondedDevices) {
                    java.lang.String address = bluetoothDevice.getAddress();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(address, "getAddress(...)");
                    java.util.Locale locale = java.util.Locale.getDefault();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(locale, "getDefault(...)");
                    java.lang.String upperCase = address.toUpperCase(locale);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(upperCase, "toUpperCase(...)");
                    if (str.length() == 32) {
                        java.lang.String substring = d(upperCase).substring(32);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                        if (r26.i0.p(substring, str, true)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosUtils", str + " ---> " + bluetoothDevice.getAddress());
                            java.lang.String address2 = bluetoothDevice.getAddress();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(address2, "getAddress(...)");
                            return address2;
                        }
                    } else {
                        java.lang.String address3 = bluetoothDevice.getAddress();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(address3, "getAddress(...)");
                        java.util.Locale locale2 = java.util.Locale.getDefault();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(locale2, "getDefault(...)");
                        java.lang.String upperCase2 = address3.toUpperCase(locale2);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(upperCase2, "toUpperCase(...)");
                        if (r26.i0.p(d(upperCase2), str, true)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosUtils", str + " ---> " + bluetoothDevice.getAddress());
                            java.lang.String address4 = bluetoothDevice.getAddress();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(address4, "getAddress(...)");
                            return address4;
                        }
                    }
                }
            }
        }
        return str;
    }

    public final boolean b(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.Object systemService = context.getSystemService("bluetooth");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.bluetooth.BluetoothManager");
        return ((android.bluetooth.BluetoothManager) systemService).getAdapter().isEnabled();
    }

    public final boolean c(android.content.Context context, java.lang.String realMac) {
        java.lang.String address;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(realMac, "realMac");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosUtils", "checkDeviceBonded ".concat(realMac));
        if (realMac.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosUtils", "checkDeviceBonded mac is empty");
            return false;
        }
        try {
            if (android.os.Build.VERSION.SDK_INT >= 31 && b3.l.m9698x3fed0563(context, "android.permission.BLUETOOTH_CONNECT") != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Rtos.RtosUtils", "BLUETOOTH_CONNECT permission denied, cannot check bonded devices");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Rtos.RtosUtils", "no bondedDevices");
                return false;
            }
            java.lang.Object systemService = context.getSystemService("bluetooth");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.bluetooth.BluetoothManager");
            java.util.Set<android.bluetooth.BluetoothDevice> bondedDevices = ((android.bluetooth.BluetoothManager) systemService).getAdapter().getBondedDevices();
            if (bondedDevices != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosUtils", "bondedDevices.size=" + bondedDevices.size());
                java.util.Iterator<android.bluetooth.BluetoothDevice> it = bondedDevices.iterator();
                while (it.hasNext()) {
                    android.bluetooth.BluetoothDevice next = it.next();
                    if ((next == null || (address = next.getAddress()) == null || !r26.i0.p(address, realMac, true)) ? false : true) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosUtils", "device " + realMac + " was bonded!");
                        return true;
                    }
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Rtos.RtosUtils", "bondedDevices is null");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Rtos.RtosUtils", "no bondedDevices");
            return false;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Rtos.RtosUtils", "checkDeviceBonded error: " + e17);
            return false;
        }
    }

    public final java.lang.String d(java.lang.String input) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(input, "input");
        if (input.length() > 0) {
            try {
                java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(messageDigest, "getInstance(...)");
                messageDigest.update(r26.i0.m(input));
                byte[] digest = messageDigest.digest();
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(digest);
                for (byte b17 : digest) {
                    java.lang.String hexString = java.lang.Integer.toHexString(b17 & 255);
                    if (hexString.length() == 1) {
                        stringBuffer.append('0');
                    }
                    stringBuffer.append(hexString);
                }
                java.lang.String stringBuffer2 = stringBuffer.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stringBuffer2, "toString(...)");
                return stringBuffer2;
            } catch (java.lang.Exception unused) {
            }
        }
        return "";
    }
}
