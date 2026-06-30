package rt1;

/* loaded from: classes7.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qt1.f f481020d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.ActivityC13028x321e1ca7 f481021e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(qt1.f fVar, com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.ActivityC13028x321e1ca7 activityC13028x321e1ca7) {
        super(0);
        this.f481020d = fVar;
        this.f481021e = activityC13028x321e1ca7;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        qt1.f fVar = this.f481020d;
        if (fVar.f448054e == -17500) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.ActivityC13028x321e1ca7 activityC13028x321e1ca7 = this.f481021e;
            activityC13028x321e1ca7.setResult(-2);
            activityC13028x321e1ca7.finish();
        } else {
            st1.g.b(fVar);
        }
        return jz5.f0.f384359a;
    }
}
