package kz0;

/* loaded from: classes3.dex */
public final class n0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.y f395314d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.y yVar) {
        super(1);
        this.f395314d = yVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.y yVar = this.f395314d;
        if (!yVar.f151862h && yVar.f151863i != booleanValue) {
            yVar.f151862h = true;
        }
        yVar.f151863i = booleanValue;
        if (booleanValue) {
            yVar.f151856b.mo152xb9724478();
        } else {
            yVar.f151857c.mo152xb9724478();
        }
        return jz5.f0.f384359a;
    }
}
