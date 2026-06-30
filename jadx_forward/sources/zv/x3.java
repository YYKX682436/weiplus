package zv;

/* loaded from: classes.dex */
public final class x3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p697xfe7cbaae.C10465x1b7ee7d f557666d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f557667e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(com.p314xaae8f345.mm.p689xc5a27af6.p697xfe7cbaae.C10465x1b7ee7d c10465x1b7ee7d, java.lang.String str) {
        super(1);
        this.f557666d = c10465x1b7ee7d;
        this.f557667e = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Object value = ((p3321xbce91901.C29043x91b2b43d) obj).getValue();
        boolean m143903xa8fbbff4 = p3321xbce91901.C29043x91b2b43d.m143903xa8fbbff4(value);
        com.p314xaae8f345.mm.p689xc5a27af6.p697xfe7cbaae.C10465x1b7ee7d c10465x1b7ee7d = this.f557666d;
        if (m143903xa8fbbff4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c10465x1b7ee7d.f146722d, "onUpdateTemplateMsgScopeItemList success for templateId: " + this.f557667e);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(c10465x1b7ee7d.f146722d, "onUpdateTemplateMsgScopeItemList failed: " + p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(value));
        }
        return jz5.f0.f384359a;
    }
}
