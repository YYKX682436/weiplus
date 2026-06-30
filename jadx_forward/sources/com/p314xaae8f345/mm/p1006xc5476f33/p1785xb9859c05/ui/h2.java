package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes14.dex */
public class h2 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.C16138x11b4d11b f224383d;

    public h2(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.C16138x11b4d11b c16138x11b4d11b) {
        this.f224383d = c16138x11b4d11b;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallFuncButton$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.C16138x11b4d11b c16138x11b4d11b = this.f224383d;
        if (!c16138x11b4d11b.f224162o) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/ipcall/ui/IPCallFuncButton$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        if (motionEvent.getAction() == 0) {
            if (c16138x11b4d11b.f224160m) {
                if (c16138x11b4d11b.f224161n) {
                    c16138x11b4d11b.f224154d.setImageDrawable(c16138x11b4d11b.f224156f);
                    c16138x11b4d11b.f224161n = false;
                } else {
                    c16138x11b4d11b.f224154d.setImageDrawable(c16138x11b4d11b.f224157g);
                    c16138x11b4d11b.f224161n = true;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.i2 i2Var = c16138x11b4d11b.f224163p;
                if (i2Var != null) {
                    i2Var.a(c16138x11b4d11b.f224161n);
                }
            } else {
                android.graphics.drawable.Drawable drawable = c16138x11b4d11b.f224157g;
                if (drawable != null) {
                    c16138x11b4d11b.f224154d.setImageDrawable(drawable);
                }
            }
        } else if ((motionEvent.getAction() == 3 || motionEvent.getAction() == 1) && !c16138x11b4d11b.f224160m) {
            android.graphics.drawable.Drawable drawable2 = c16138x11b4d11b.f224156f;
            if (drawable2 != null) {
                c16138x11b4d11b.f224154d.setImageDrawable(drawable2);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.i2 i2Var2 = c16138x11b4d11b.f224163p;
            if (i2Var2 != null) {
                i2Var2.a(false);
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/ipcall/ui/IPCallFuncButton$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
