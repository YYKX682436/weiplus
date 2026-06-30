package fp4;

/* loaded from: classes10.dex */
public final class o implements fp4.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fp4.s f346902a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ju3.d0 f346903b;

    public o(fp4.s sVar, ju3.d0 d0Var) {
        this.f346902a = sVar;
        this.f346903b = d0Var;
    }

    @Override // fp4.e
    public void a(long j17, long j18, boolean z17) {
        bv3.d dVar;
        bv3.d dVar2;
        bv3.d dVar3;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCropCallback: [");
        sb6.append(j17);
        sb6.append(", ");
        sb6.append(j18);
        sb6.append("], onUp:");
        sb6.append(z17);
        sb6.append(", showTime start:");
        fp4.s sVar = this.f346902a;
        zu3.a aVar = sVar.f346918t;
        java.lang.Long l17 = null;
        sb6.append((aVar == null || (dVar3 = aVar.f557293c) == null) ? null : java.lang.Long.valueOf(dVar3.c()));
        sb6.append(" end:");
        zu3.a aVar2 = sVar.f346918t;
        if (aVar2 != null && (dVar2 = aVar2.f557293c) != null) {
            l17 = java.lang.Long.valueOf(dVar2.b());
        }
        sb6.append(l17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogTimeEditPlugin", sb6.toString());
        if (sVar.f346914p != j17) {
            sVar.f346914p = j17;
            sVar.f346915q = j18;
        } else {
            sVar.f346914p = j17;
            sVar.f346915q = j18;
            j17 = j18;
        }
        zu3.a aVar3 = sVar.f346918t;
        if (aVar3 != null && (dVar = aVar3.f557292b) != null) {
            dVar.d(sVar.f346914p, sVar.f346915q);
        }
        ju3.c0 c0Var = ju3.c0.f383423n2;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putLong("EDIT_CROP_VLOG_LENGTH_START_TIME_LONG", sVar.f346914p);
        bundle.putLong("EDIT_CROP_VLOG_LENGTH_END_TIME_LONG", sVar.f346915q);
        bundle.putLong("EDIT_CROP_VLOG_SEEKTIME_LONG", j17);
        bundle.putBoolean("EDIT_CROP_VLOG_ON_UP_BOOLEAN", z17);
        this.f346903b.w(c0Var, bundle);
    }
}
