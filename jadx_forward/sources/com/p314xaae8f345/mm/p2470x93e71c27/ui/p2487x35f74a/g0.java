package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a;

/* loaded from: classes11.dex */
public class g0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f272744d;

    public g0(java.lang.String[] strArr) {
        this.f272744d = strArr;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        int i17 = 0;
        while (true) {
            java.lang.String[] strArr = this.f272744d;
            if (i17 >= strArr.length) {
                return;
            }
            g4Var.f(i17, strArr[i17]);
            i17++;
        }
    }
}
