package xe5;

/* loaded from: classes3.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xe5.f f535517d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f535518e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xe5.i f535519f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(xe5.f fVar, java.lang.String str, xe5.i iVar) {
        super(1);
        this.f535517d = fVar;
        this.f535518e = str;
        this.f535519f = iVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int i17;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar != null && (i17 = fVar.f152148a) == 0 && i17 == 0) {
            int i18 = xe5.f.f535554i;
            this.f535517d.getClass();
            xe5.g0.f535559g.putBoolean(this.f535518e + "_game_team", true);
            android.widget.TextView textView = this.f535519f.f535583k;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
        return jz5.f0.f384359a;
    }
}
