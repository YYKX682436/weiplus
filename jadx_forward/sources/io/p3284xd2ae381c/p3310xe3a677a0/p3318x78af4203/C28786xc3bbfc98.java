package io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203;

/* renamed from: io.flutter.plugins.webviewflutter.DisplayListenerProxy */
/* loaded from: classes11.dex */
class C28786xc3bbfc98 {
    private static final java.lang.String TAG = "DisplayListenerProxy";

    /* renamed from: listenersBeforeWebView */
    private java.util.ArrayList<android.hardware.display.DisplayManager.DisplayListener> f71991x4dc8a79b;

    /* renamed from: yoinkDisplayListeners */
    private static java.util.ArrayList<android.hardware.display.DisplayManager.DisplayListener> m138952xd0d8e0cd(android.hardware.display.DisplayManager displayManager) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return new java.util.ArrayList<>();
        }
        try {
            java.lang.reflect.Field declaredField = android.hardware.display.DisplayManager.class.getDeclaredField("mGlobal");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(displayManager);
            java.lang.reflect.Field declaredField2 = obj.getClass().getDeclaredField("mDisplayListeners");
            declaredField2.setAccessible(true);
            java.util.ArrayList arrayList = (java.util.ArrayList) declaredField2.get(obj);
            java.util.ArrayList<android.hardware.display.DisplayManager.DisplayListener> arrayList2 = new java.util.ArrayList<>();
            java.util.Iterator it = arrayList.iterator();
            java.lang.reflect.Field field = null;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                if (field == null) {
                    field = next.getClass().getField("mListener");
                    field.setAccessible(true);
                }
                arrayList2.add((android.hardware.display.DisplayManager.DisplayListener) field.get(next));
            }
            return arrayList2;
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchFieldException e17) {
            e17.toString();
            return new java.util.ArrayList<>();
        }
    }

    /* renamed from: onPostWebViewInitialization */
    public void m138953x9b50b3a(final android.hardware.display.DisplayManager displayManager) {
        final java.util.ArrayList<android.hardware.display.DisplayManager.DisplayListener> m138952xd0d8e0cd = m138952xd0d8e0cd(displayManager);
        m138952xd0d8e0cd.removeAll(this.f71991x4dc8a79b);
        if (m138952xd0d8e0cd.isEmpty()) {
            return;
        }
        java.util.Iterator<android.hardware.display.DisplayManager.DisplayListener> it = m138952xd0d8e0cd.iterator();
        while (it.hasNext()) {
            displayManager.unregisterDisplayListener(it.next());
            displayManager.registerDisplayListener(new android.hardware.display.DisplayManager.DisplayListener() { // from class: io.flutter.plugins.webviewflutter.DisplayListenerProxy.1
                @Override // android.hardware.display.DisplayManager.DisplayListener
                public void onDisplayAdded(int i17) {
                    java.util.Iterator it6 = m138952xd0d8e0cd.iterator();
                    while (it6.hasNext()) {
                        ((android.hardware.display.DisplayManager.DisplayListener) it6.next()).onDisplayAdded(i17);
                    }
                }

                @Override // android.hardware.display.DisplayManager.DisplayListener
                public void onDisplayChanged(int i17) {
                    if (displayManager.getDisplay(i17) == null) {
                        return;
                    }
                    java.util.Iterator it6 = m138952xd0d8e0cd.iterator();
                    while (it6.hasNext()) {
                        ((android.hardware.display.DisplayManager.DisplayListener) it6.next()).onDisplayChanged(i17);
                    }
                }

                @Override // android.hardware.display.DisplayManager.DisplayListener
                public void onDisplayRemoved(int i17) {
                    java.util.Iterator it6 = m138952xd0d8e0cd.iterator();
                    while (it6.hasNext()) {
                        ((android.hardware.display.DisplayManager.DisplayListener) it6.next()).onDisplayRemoved(i17);
                    }
                }
            }, null);
        }
    }

    /* renamed from: onPreWebViewInitialization */
    public void m138954xfed94b35(android.hardware.display.DisplayManager displayManager) {
        this.f71991x4dc8a79b = m138952xd0d8e0cd(displayManager);
    }
}
