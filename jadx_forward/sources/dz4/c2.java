package dz4;

/* loaded from: classes12.dex */
public final class c2 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ih0.p f326714a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f326715b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f326716c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz4.d2 f326717d;

    public c2(ih0.p pVar, android.app.Activity activity, java.lang.String str, dz4.d2 d2Var) {
        this.f326714a = pVar;
        this.f326715b = activity;
        this.f326716c = str;
        this.f326717d = d2Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        if (z17) {
            java.lang.ref.WeakReference weakReference = ((ez4.u) this.f326714a).f339477c;
            if ((weakReference != null ? (android.app.Activity) weakReference.get() : null) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeNoteFlutterForwardChatHelper", "showSelectForwardUI: context null");
                return;
            }
            android.app.Activity activity = this.f326715b;
            ih0.p pVar = this.f326714a;
            this.f326717d.b(new dz4.g2(activity, pVar, ((ez4.u) pVar).f339475a, this.f326716c, str));
        }
    }
}
