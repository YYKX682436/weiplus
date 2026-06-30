package du3;

/* loaded from: classes10.dex */
public final class s implements vh0.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ du3.b0 f325225a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ du3.b f325226b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ju3.d0 f325227c;

    public s(du3.b0 b0Var, du3.b bVar, ju3.d0 d0Var) {
        this.f325225a = b0Var;
        this.f325226b = bVar;
        this.f325227c = d0Var;
    }

    @Override // vh0.i1
    /* renamed from: onResult */
    public void mo56534x57429edc(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
        if (!bool.booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImproveEditPhotoAiPlugin", "no permission");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select ai feature:");
        du3.b0 b0Var = this.f325225a;
        sb6.append(b0Var.f325066r);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoAiPlugin", sb6.toString());
        b0Var.f325066r = this.f325226b;
        ju3.d0.k(this.f325227c, ju3.c0.f383401a2, null, 2, null);
    }
}
