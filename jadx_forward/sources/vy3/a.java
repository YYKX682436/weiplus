package vy3;

/* loaded from: classes.dex */
public final class a implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f522996d;

    public a(java.lang.String[] strArr) {
        this.f522996d = strArr;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        java.lang.String[] strArr = this.f522996d;
        int length = strArr.length;
        for (int i17 = 0; i17 < length; i17++) {
            g4Var.f(i17, strArr[i17]);
        }
    }
}
