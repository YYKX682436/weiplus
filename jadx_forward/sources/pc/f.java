package pc;

/* loaded from: classes14.dex */
public abstract class f {
    public static com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2924x2fe19508 a(int i17, boolean z17) {
        com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2924x2fe19508 enumC2924x2fe19508;
        com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2924x2fe19508 enumC2924x2fe195082 = com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2924x2fe19508.NONE;
        mc.p.f407064a.b("CommonUtils", "callbackAuthEvent: actionType " + i17 + ", isDoneEvent: " + z17);
        if (i17 == 1) {
            com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2928xc7ce2777 enumC2928xc7ce2777 = com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2928xc7ce2777.ActionBlink;
            if (!z17) {
                int i18 = ic.d.f371814k;
                ic.c.f371813a.getClass();
                pc.l.f434744a.f434745a = enumC2928xc7ce2777;
            }
            enumC2924x2fe19508 = z17 ? com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2924x2fe19508.BLINK_CHECK_DONE : com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2924x2fe19508.BLINK_CHECK;
        } else if (i17 == 2) {
            com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2928xc7ce2777 enumC2928xc7ce27772 = com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2928xc7ce2777.ActionOpenMouth;
            if (!z17) {
                int i19 = ic.d.f371814k;
                ic.c.f371813a.getClass();
                pc.l.f434744a.f434745a = enumC2928xc7ce27772;
            }
            enumC2924x2fe19508 = z17 ? com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2924x2fe19508.OPEN_MOUTH_CHECK_DONE : com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2924x2fe19508.OPEN_MOUTH_CHECK;
        } else if (i17 == 3) {
            com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2928xc7ce2777 enumC2928xc7ce27773 = com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2928xc7ce2777.ActionNodHead;
            if (!z17) {
                int i27 = ic.d.f371814k;
                ic.c.f371813a.getClass();
                pc.l.f434744a.f434745a = enumC2928xc7ce27773;
            }
            enumC2924x2fe19508 = z17 ? com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2924x2fe19508.NOD_HEAD_CHECK_DONE : com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2924x2fe19508.NOD_HEAD_CHECK;
        } else if (i17 != 4) {
            if (i17 == 5) {
                com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2928xc7ce2777 enumC2928xc7ce27774 = com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2928xc7ce2777.ActionSilence;
                if (!z17) {
                    int i28 = ic.d.f371814k;
                    ic.c.f371813a.getClass();
                    pc.l.f434744a.f434745a = enumC2928xc7ce27774;
                }
            } else if (i17 == 7) {
                enumC2924x2fe19508 = com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2924x2fe19508.REFLECT_CHECK;
            }
            enumC2924x2fe19508 = enumC2924x2fe195082;
        } else {
            com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2928xc7ce2777 enumC2928xc7ce27775 = com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2928xc7ce2777.ActionShakeHead;
            if (!z17) {
                int i29 = ic.d.f371814k;
                ic.c.f371813a.getClass();
                pc.l.f434744a.f434745a = enumC2928xc7ce27775;
            }
            enumC2924x2fe19508 = z17 ? com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2924x2fe19508.SHAKE_HEAD_CHECK_DONE : com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2924x2fe19508.SHAKE_HEAD_CHECK;
        }
        if (enumC2924x2fe19508 != enumC2924x2fe195082) {
            int i37 = ic.d.f371814k;
            ic.c.f371813a.c(enumC2924x2fe19508);
        }
        return enumC2924x2fe19508;
    }

    public static void b() {
        try {
            final lc.i a17 = mc.a.f407027a.a();
            if (a17 != null) {
                a17.a(new java.lang.Runnable() { // from class: pc.f$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        lc.i iVar = lc.i.this;
                        if (iVar instanceof lc.g) {
                            lc.g gVar = (lc.g) iVar;
                            mc.q qVar = mc.p.f407064a;
                            qVar.b("CommonUtils", "closeCurrentFragment!");
                            gVar.getClass();
                            qVar.e("AuthingFragment", "releaseDeviceRes!");
                            gVar.f399356x = false;
                            if (gVar.f399353u != null) {
                                gVar.f399353u.m21559x41012807();
                                oc.g.f425634a.a();
                                gVar.f399353u = null;
                            }
                        }
                        lc.g gVar2 = (lc.g) iVar;
                        if (gVar2.getActivity() == null) {
                            mc.p.f407064a.e("BaseFragment", "getActivity is null!");
                        } else {
                            android.app.Activity activity = gVar2.getActivity();
                            java.util.Objects.requireNonNull(activity);
                            if (activity.isFinishing()) {
                                mc.p.f407064a.e("BaseFragment", "getActivity is finishing!");
                            } else {
                                int i17 = ic.d.f371814k;
                                ic.d dVar = ic.c.f371813a;
                                dVar.f371817c = true;
                                com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p333xb29de3e3.C2919x968bacde e17 = dVar.e();
                                if (e17 == null || !e17.m21794x603da55c()) {
                                    mc.b bVar = mc.a.f407027a;
                                    if (bVar.f407029b != null) {
                                        bVar.f407029b = null;
                                    }
                                    if (bVar.f407028a != null) {
                                        bVar.f407028a = null;
                                    }
                                    mc.p.f407064a.e("BaseFragment", "getActivity start finish!");
                                    android.app.Activity activity2 = gVar2.getActivity();
                                    java.util.Objects.requireNonNull(activity2);
                                    activity2.finish();
                                }
                            }
                        }
                        int i18 = ic.d.f371814k;
                        ic.c.f371813a.f371817c = true;
                    }
                });
            }
        } catch (java.lang.Exception e17) {
            mc.p.f407064a.e("CommonUtils", "close current fragment error! e" + e17.getLocalizedMessage());
        }
    }

    public static void c(int i17, java.lang.String str) {
        int i18 = ic.d.f371814k;
        ic.c.f371813a.b(i17, str);
    }

    public static boolean d(java.lang.String str, java.lang.String str2) {
        if (!android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(str2)) {
            try {
                if (!new java.io.File(str).exists()) {
                    return false;
                }
                try {
                    java.io.FileInputStream fileInputStream = new java.io.FileInputStream(str);
                    try {
                        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(str2);
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int read = fileInputStream.read(bArr);
                                if (read == -1) {
                                    fileOutputStream.flush();
                                    fileOutputStream.close();
                                    fileInputStream.close();
                                    return true;
                                }
                                fileOutputStream.write(bArr, 0, read);
                            }
                        } finally {
                        }
                    } finally {
                    }
                } catch (java.lang.Exception unused) {
                    mc.p.f407064a.e("CommonUtils", "copy video error.");
                    return false;
                }
            } catch (java.lang.Exception e17) {
                mc.p.f407064a.e("CommonUtils", "source file is null: " + e17.getLocalizedMessage());
            }
        }
        return false;
    }
}
