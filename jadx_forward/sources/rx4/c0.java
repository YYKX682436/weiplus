package rx4;

/* loaded from: classes8.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.e0 f482648d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rx4.i f482649e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f482650f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f482651g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f482652h;

    public c0(rx4.e0 e0Var, rx4.i iVar, int i17, android.view.ViewGroup viewGroup, java.lang.String str) {
        this.f482648d = e0Var;
        this.f482649e = iVar;
        this.f482650f = i17;
        this.f482651g = viewGroup;
        this.f482652h = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachHistoryBoxUIC$updateHistoryBox$1$1$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rx4.e0 e0Var = this.f482648d;
        boolean z17 = e0Var.f482672f;
        int i17 = this.f482650f;
        rx4.i iVar = this.f482649e;
        if (z17) {
            e0Var.W6(vu4.a.f521786w, iVar, java.lang.Integer.valueOf(i17));
            e0Var.U6(iVar, i17);
            rx4.e0.Y6(e0Var, false, 1, null);
        } else {
            e0Var.m174141x36654fab();
            e0Var.W6(vu4.a.f521776m, iVar, java.lang.Integer.valueOf(i17));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[hitest] historyItem click, index=");
            sb6.append(i17);
            sb6.append(", hasSearchId=");
            sb6.append(iVar.f482723f.length() > 0);
            sb6.append(", isLive=");
            sb6.append(iVar.f482724g);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSNativeTeachHistoryBoxUIC", sb6.toString());
            boolean z18 = iVar.f482723f.length() == 0;
            android.view.ViewGroup viewGroup = this.f482651g;
            if (z18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSNativeTeachHistoryBoxUIC", "[hitest] searchId empty, fallback searchQuery without searchId");
                android.content.Context context = viewGroup.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                pf5.z zVar = pf5.z.f435481a;
                if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(rx4.h2.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
                rx4.h2.u7((rx4.h2) a17, 65, this.f482652h, iVar.f482720c, null, null, 24, null);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSNativeTeachHistoryBoxUIC", "[hitest] searchQuery with searchId");
                android.content.Context context2 = viewGroup.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                pf5.z zVar2 = pf5.z.f435481a;
                if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                p012xc85e97e9.p093xedfae76a.c1 a18 = zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(rx4.h2.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "get(...)");
                rx4.h2.u7((rx4.h2) a18, 65, this.f482652h, iVar.f482723f, iVar.f482720c, null, 16, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachHistoryBoxUIC$updateHistoryBox$1$1$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
