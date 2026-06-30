package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public final class q3 {

    /* renamed from: a, reason: collision with root package name */
    public final android.util.SparseArray f282825a;

    /* renamed from: b, reason: collision with root package name */
    public int f282826b;

    /* renamed from: c, reason: collision with root package name */
    public int f282827c;

    /* renamed from: d, reason: collision with root package name */
    public float f282828d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f282829e;

    public q3(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f282825a = new android.util.SparseArray();
        this.f282826b = -1;
        this.f282827c = -1;
        this.f282829e = true;
    }

    public static final java.lang.Object a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.q3 q3Var, yz5.l func) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(func, "func");
        if (q3Var != null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.g4 g4Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.g4) q3Var.f282825a.get(q3Var.f282826b);
            if (g4Var != null) {
                return func.mo146xb9724478(g4Var);
            }
        }
        return null;
    }

    public static final void b(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.q3 q3Var, yz5.p func, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(func, "func");
        if (q3Var != null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.g4 g4Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.g4) q3Var.f282825a.get(q3Var.f282826b);
            if (g4Var != null) {
                func.mo149xb9724478(g4Var, obj);
            }
        }
    }

    public static final void c(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.q3 q3Var, yz5.q func, java.lang.Object obj, java.lang.Object obj2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(func, "func");
        if (q3Var != null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.g4 g4Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.g4) q3Var.f282825a.get(q3Var.f282826b);
            if (g4Var != null) {
                func.mo147xb9724478(g4Var, obj, obj2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(yz5.l reportFunc) {
        kz5.p0 p0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportFunc, "reportFunc");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.g4 g4Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.g4) this.f282825a.get(this.f282826b);
        if (g4Var != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("pic_video_close");
            arrayList.add("pic_video_save");
            arrayList.add("pic_video_three_dot");
            arrayList.add("pic_video_forward");
            arrayList.add("pic_video_wall");
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.r3 r3Var = g4Var.f282483e;
            p0Var = arrayList;
            if (r3Var != null) {
                if (r3Var.f282855c) {
                    arrayList.add("video_speed");
                    arrayList.add("video_play_btn");
                } else {
                    if (r3Var.f282857e) {
                        arrayList.add("pic_video_read_origin");
                    }
                    if (r3Var.f282856d) {
                        arrayList.add("pic_video_miniapp");
                    }
                }
                p0Var = arrayList;
                if (r3Var.f282860h) {
                    arrayList.add("pic_video_full_image");
                    p0Var = arrayList;
                }
            }
        } else {
            p0Var = kz5.p0.f395529d;
        }
        java.util.Iterator<E> it = p0Var.iterator();
        while (it.hasNext()) {
            reportFunc.mo146xb9724478(it.next());
        }
    }

    public final void e(float f17, boolean z17) {
        if (this.f282827c < 0) {
            this.f282827c = this.f282826b;
            this.f282828d = f17;
        }
        if (java.lang.Math.abs(f17 - this.f282828d) > 0.95d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryOPLayer", "updatePageScrollInfo: skip " + this.f282828d + ", " + f17);
            return;
        }
        float f18 = z17 ? 1.0f - f17 : f17;
        int i17 = this.f282827c;
        android.util.SparseArray sparseArray = this.f282825a;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.g4 g4Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.g4) sparseArray.get(i17);
        if (g4Var != null) {
            g4Var.f282479a.f346937a.setAlpha(java.lang.Math.max((2 * f18) - 1.0f, 0.0f));
        }
        if (z17) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.g4 g4Var2 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.g4) sparseArray.get(this.f282827c + 1);
            if (g4Var2 != null) {
                g4Var2.f282479a.f346937a.setAlpha(java.lang.Math.max(1.0f - (f18 * 2), 0.0f));
            }
        } else {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.g4 g4Var3 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.g4) sparseArray.get(this.f282827c - 1);
            if (g4Var3 != null) {
                g4Var3.f282479a.f346937a.setAlpha(java.lang.Math.max(1.0f - (f18 * 2), 0.0f));
            }
        }
        this.f282828d = f17;
    }
}
