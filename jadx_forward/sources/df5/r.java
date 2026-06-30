package df5;

/* loaded from: classes11.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df5.t f313729d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(df5.t tVar) {
        super(1);
        this.f313729d = tVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        df5.t tVar = this.f313729d;
        yz5.l lVar = tVar.f313745e;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.valueOf(booleanValue));
        }
        df5.u1 u1Var = tVar.f313743c;
        if (!booleanValue && tVar.f313744d) {
            android.widget.TextView textView = tVar.f313742b.f313598e;
            if (textView != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MarkdownStreamAnimController", "[STREAM_ANIM] feeder idle + stream active, starting waiting dots");
                u1Var.b(textView);
            }
        } else if (booleanValue && u1Var.f313762j) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MarkdownStreamAnimController", "[STREAM_ANIM] feeder busy, stopping waiting dots");
            u1Var.c();
        }
        return jz5.f0.f384359a;
    }
}
