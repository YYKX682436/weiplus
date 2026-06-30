package dk2;

/* loaded from: classes3.dex */
public final class o3 implements ke2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ke2.f f315365a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f315366b;

    public o3(ke2.f fVar, android.content.Context context) {
        this.f315365a = fVar;
        this.f315366b = context;
    }

    @Override // ke2.f
    public void a(int i17, int i18, java.lang.String str, long j17, r45.cv2 cv2Var) {
        android.content.Context context = this.f315366b;
        if (i18 == -200139) {
            android.content.Context context2 = this.f315366b;
            db5.e1.E(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cz9), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi), false, null);
        } else {
            db5.t7.g(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573076dh2));
        }
        ke2.f fVar = this.f315365a;
        if (fVar != null) {
            fVar.a(i17, i18, str, j17, cv2Var);
        }
    }

    @Override // ke2.f
    public void b(long j17, long j18, r45.cv2 cv2Var) {
        ke2.f fVar = this.f315365a;
        if (fVar != null) {
            fVar.b(j17, j18, cv2Var);
        }
    }
}
