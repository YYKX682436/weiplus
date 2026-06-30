package ie;

/* loaded from: classes7.dex */
public final class b extends android.widget.FrameLayout implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.n3 {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f372485d;

    public b(android.content.Context context) {
        super(context);
        ie.c cVar = ie.d.H;
        if (cVar != null) {
            ((la1.h) cVar).getClass();
            android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d4w, (android.view.ViewGroup) this, true);
        } else {
            android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569565ex, (android.view.ViewGroup) this, true);
        }
        ((android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.f566648gl3)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.a1b);
        setClickable(true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.n3
    public void a(boolean z17) {
        setVisibility(z17 ? 8 : 0);
    }

    public android.view.View b() {
        if (this.f372485d == null) {
            this.f372485d = findViewById(com.p314xaae8f345.mm.R.id.f566648gl3);
        }
        return this.f372485d;
    }
}
