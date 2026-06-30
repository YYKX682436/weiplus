package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes12.dex */
public class o4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String[] f273337d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f273338e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f273339f;

    /* renamed from: g, reason: collision with root package name */
    public int f273340g;

    /* renamed from: h, reason: collision with root package name */
    public int f273341h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r4 f273342i;

    public o4(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r4 r4Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g4 g4Var) {
        this.f273342i = r4Var;
    }

    public final android.graphics.Bitmap a(java.lang.String str) {
        if (str == null) {
            return null;
        }
        if (this.f273341h <= 0 || this.f273340g <= 0) {
            java.util.Vector vector = x51.w0.f533636a;
            return x51.v0.b(str);
        }
        this.f273342i.getClass();
        java.lang.String str2 = str + "_" + this.f273340g + "_" + this.f273341h;
        int i17 = this.f273340g;
        int i18 = this.f273341h;
        java.util.Vector vector2 = x51.w0.f533636a;
        android.graphics.Bitmap d17 = x51.v0.d(str2, i17, i18);
        if (d17 != null) {
            return d17;
        }
        int a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.l.a(str);
        android.graphics.Bitmap T = (90 == a17 || 270 == a17) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x.T(str, this.f273340g, this.f273341h, true) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x.T(str, this.f273341h, this.f273340g, true);
        if (T == null) {
            return T;
        }
        android.graphics.Bitmap w07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(T, a17);
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(w07, 100, android.graphics.Bitmap.CompressFormat.PNG, str2, false);
            return w07;
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ImageEngine", e17, "", new java.lang.Object[0]);
            return w07;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f273342i.f273397a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ImageEngine", "on load image jog, isQuit, return");
            return;
        }
        synchronized (this.f273342i.f273398b) {
            if (this.f273342i.f273401e.get(this.f273339f) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ImageEngine", "check before decode, no match wait to render view, renderKey is %s, return", this.f273339f);
                return;
            }
            android.graphics.Bitmap bitmap = null;
            if (this.f273337d != null) {
                int i17 = 0;
                while (true) {
                    java.lang.String[] strArr = this.f273337d;
                    if (i17 >= strArr.length) {
                        break;
                    }
                    if (i17 == 0) {
                        bitmap = a(strArr[0]);
                        if (bitmap != null) {
                            this.f273342i.f273403g.put(this.f273339f, bitmap);
                            break;
                        }
                        i17++;
                    } else {
                        java.lang.String c17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r4.c(strArr[i17], this.f273338e, this.f273340g, this.f273341h);
                        android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) this.f273342i.f273403g.get(c17);
                        if (bitmap2 == null) {
                            bitmap2 = a(this.f273337d[i17]);
                        }
                        if (bitmap2 != null) {
                            this.f273342i.f273403g.put(c17, bitmap2);
                            bitmap = bitmap2;
                            break;
                        } else {
                            bitmap = bitmap2;
                            i17++;
                        }
                    }
                }
            }
            if (bitmap == null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f273338e) && (bitmap = x51.w0.d(this.f273342i.d(this.f273339f, this.f273338e, this.f273340g, this.f273341h))) != null) {
                this.f273342i.f273403g.put(this.f273339f, bitmap);
            }
            if (bitmap != null) {
                synchronized (this.f273342i.f273398b) {
                    android.widget.ImageView imageView = (android.widget.ImageView) this.f273342i.f273401e.get(this.f273339f);
                    if (imageView != null) {
                        this.f273342i.f273402f.remove(imageView);
                        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.n4 n4Var = this.f273342i.f273405i;
                        java.util.LinkedList linkedList = n4Var.f273324b;
                        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.q4 q4Var = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.q4) (linkedList.isEmpty() ? n4Var.a() : linkedList.removeFirst());
                        q4Var.f273384d = imageView;
                        q4Var.f273385e = bitmap;
                        this.f273342i.f273400d.mo50293x3498a0(q4Var);
                    }
                    this.f273342i.f273401e.remove(this.f273339f);
                }
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f273342i.f273406j.f273325c;
            n3Var.mo50308x2936bf5f(n3Var.mo50292x733c63a2(1, this));
        }
    }
}
