package az0;

/* loaded from: classes5.dex */
public final class fc implements com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnTaskProgress {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u26.r0 f97012a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f97013b;

    public fc(u26.r0 r0Var, java.lang.String str) {
        this.f97012a = r0Var;
        this.f97013b = str;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnTaskProgress
    /* renamed from: onTaskProgress */
    public final void mo9321xda309251(float f17, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4090xe7a30da3 c4090xe7a30da3) {
        if (((u26.x) this.f97012a).e(java.lang.Float.valueOf(f17)) instanceof u26.b0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MaasFuncUtils", this.f97013b + " try send error " + f17);
        }
    }
}
