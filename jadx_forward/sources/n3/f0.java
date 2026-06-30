package n3;

/* loaded from: classes14.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    public android.view.ViewParent f415864a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.ViewParent f415865b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f415866c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f415867d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f415868e;

    public f0(android.view.View view) {
        this.f415866c = view;
    }

    public boolean a(float f17, float f18, boolean z17) {
        android.view.ViewParent g17;
        if (!this.f415867d || (g17 = g(0)) == null) {
            return false;
        }
        try {
            return n3.y1.a(g17, this.f415866c, f17, f18, z17);
        } catch (java.lang.AbstractMethodError unused) {
            java.util.Objects.toString(g17);
            return false;
        }
    }

    public boolean b(float f17, float f18) {
        android.view.ViewParent g17;
        if (!this.f415867d || (g17 = g(0)) == null) {
            return false;
        }
        try {
            return n3.y1.b(g17, this.f415866c, f17, f18);
        } catch (java.lang.AbstractMethodError unused) {
            java.util.Objects.toString(g17);
            return false;
        }
    }

    public boolean c(int i17, int i18, int[] iArr, int[] iArr2) {
        return d(i17, i18, iArr, iArr2, 0);
    }

    public boolean d(int i17, int i18, int[] iArr, int[] iArr2, int i19) {
        android.view.ViewParent g17;
        int i27;
        int i28;
        int[] iArr3;
        if (!this.f415867d || (g17 = g(i19)) == null) {
            return false;
        }
        if (i17 == 0 && i18 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        android.view.View view = this.f415866c;
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            i27 = iArr2[0];
            i28 = iArr2[1];
        } else {
            i27 = 0;
            i28 = 0;
        }
        if (iArr == null) {
            if (this.f415868e == null) {
                this.f415868e = new int[2];
            }
            iArr3 = this.f415868e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        android.view.View view2 = this.f415866c;
        if (g17 instanceof n3.g0) {
            ((n3.g0) g17).t(view2, i17, i18, iArr3, i19);
        } else if (i19 == 0) {
            try {
                n3.y1.c(g17, view2, i17, i18, iArr3);
            } catch (java.lang.AbstractMethodError unused) {
                java.util.Objects.toString(g17);
            }
        }
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i27;
            iArr2[1] = iArr2[1] - i28;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public boolean e(int i17, int i18, int i19, int i27, int[] iArr) {
        return f(i17, i18, i19, i27, iArr, 0, null);
    }

    public final boolean f(int i17, int i18, int i19, int i27, int[] iArr, int i28, int[] iArr2) {
        android.view.ViewParent g17;
        int i29;
        int i37;
        int[] iArr3;
        if (!this.f415867d || (g17 = g(i28)) == null) {
            return false;
        }
        if (i17 == 0 && i18 == 0 && i19 == 0 && i27 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        android.view.View view = this.f415866c;
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            i29 = iArr[0];
            i37 = iArr[1];
        } else {
            i29 = 0;
            i37 = 0;
        }
        if (iArr2 == null) {
            if (this.f415868e == null) {
                this.f415868e = new int[2];
            }
            int[] iArr4 = this.f415868e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        android.view.View view2 = this.f415866c;
        if (g17 instanceof n3.h0) {
            ((n3.h0) g17).z(view2, i17, i18, i19, i27, i28, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i19;
            iArr3[1] = iArr3[1] + i27;
            if (g17 instanceof n3.g0) {
                ((n3.g0) g17).l(view2, i17, i18, i19, i27, i28);
            } else if (i28 == 0) {
                try {
                    n3.y1.d(g17, view2, i17, i18, i19, i27);
                } catch (java.lang.AbstractMethodError unused) {
                    java.util.Objects.toString(g17);
                }
            }
        }
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i29;
            iArr[1] = iArr[1] - i37;
        }
        return true;
    }

    public final android.view.ViewParent g(int i17) {
        if (i17 == 0) {
            return this.f415864a;
        }
        if (i17 != 1) {
            return null;
        }
        return this.f415865b;
    }

    public boolean h(int i17) {
        return g(i17) != null;
    }

    public void i(boolean z17) {
        if (this.f415867d) {
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.a1.z(this.f415866c);
        }
        this.f415867d = z17;
    }

    public boolean j(int i17, int i18) {
        boolean f17;
        if (h(i18)) {
            return true;
        }
        if (this.f415867d) {
            android.view.View view = this.f415866c;
            android.view.View view2 = view;
            for (android.view.ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                boolean z17 = parent instanceof n3.g0;
                if (z17) {
                    f17 = ((n3.g0) parent).B(view2, view, i17, i18);
                } else {
                    if (i18 == 0) {
                        try {
                            f17 = n3.y1.f(parent, view2, view, i17);
                        } catch (java.lang.AbstractMethodError unused) {
                            java.util.Objects.toString(parent);
                        }
                    }
                    f17 = false;
                }
                if (f17) {
                    if (i18 == 0) {
                        this.f415864a = parent;
                    } else if (i18 == 1) {
                        this.f415865b = parent;
                    }
                    if (z17) {
                        ((n3.g0) parent).h(view2, view, i17, i18);
                    } else if (i18 == 0) {
                        try {
                            n3.y1.e(parent, view2, view, i17);
                        } catch (java.lang.AbstractMethodError unused2) {
                            java.util.Objects.toString(parent);
                        }
                    }
                    return true;
                }
                if (parent instanceof android.view.View) {
                    view2 = parent;
                }
            }
        }
        return false;
    }

    public void k(int i17) {
        android.view.ViewParent g17 = g(i17);
        if (g17 != null) {
            boolean z17 = g17 instanceof n3.g0;
            android.view.View view = this.f415866c;
            if (z17) {
                ((n3.g0) g17).j(view, i17);
            } else if (i17 == 0) {
                try {
                    n3.y1.g(g17, view);
                } catch (java.lang.AbstractMethodError unused) {
                    java.util.Objects.toString(g17);
                }
            }
            if (i17 == 0) {
                this.f415864a = null;
            } else {
                if (i17 != 1) {
                    return;
                }
                this.f415865b = null;
            }
        }
    }
}
