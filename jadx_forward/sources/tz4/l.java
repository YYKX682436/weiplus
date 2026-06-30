package tz4;

/* loaded from: classes12.dex */
public class l implements lz4.c {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f504888a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.LinearLayout f504889b;

    /* renamed from: c, reason: collision with root package name */
    public tz4.i f504890c;

    /* renamed from: d, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f504891d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f504892e = false;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f504893f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f f504894g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f f504895h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f f504896i;

    /* renamed from: j, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f f504897j;

    /* renamed from: k, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f f504898k;

    /* renamed from: l, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f f504899l;

    public void a(boolean z17) {
        tz4.i iVar = this.f504890c;
        if (iVar != null) {
            android.content.Context context = this.f504888a.getContext();
            iVar.getClass();
            if (context == null) {
                int i17 = rl.b.f478676a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Note.WNToolBarAdapter", "recalculateLayout: pageContext is null", null);
                return;
            }
            java.lang.Object[] objArr = {java.lang.Boolean.valueOf(z17)};
            int i18 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.WNToolBarAdapter", "recalculateLayout start, notifyList=%b", objArr);
            iVar.f504885o = false;
            iVar.f504886p = -1;
            if (iVar.x(iVar.y(context)) && z17) {
                iVar.m8146xced61ae5();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.WNToolBarAdapter", "recalculateLayout: notifyDataSetChanged called", null);
            }
        }
    }

    public final void b(tz4.u uVar, boolean z17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f c22698xdfbd289f = uVar == tz4.u.Recording ? this.f504898k : (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f) this.f504890c.f504877d.get(uVar);
        if (c22698xdfbd289f != null) {
            c22698xdfbd289f.m82034x7541828(i65.a.d(c22698xdfbd289f.getContext(), z17 ? com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19 : com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        }
    }
}
