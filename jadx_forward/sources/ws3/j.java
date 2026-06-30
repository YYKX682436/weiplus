package ws3;

/* loaded from: classes9.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public java.util.List f530714a;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.p1980x300cc4.ViewOnFocusChangeListenerC16962x770823dd f530716c;

    /* renamed from: d, reason: collision with root package name */
    public ws3.y f530717d;

    /* renamed from: b, reason: collision with root package name */
    public vs3.a f530715b = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f530718e = false;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.p1980x300cc4.ViewOnFocusChangeListenerC16962x770823dd viewOnFocusChangeListenerC16962x770823dd) {
        this.f530716c = null;
        this.f530716c = viewOnFocusChangeListenerC16962x770823dd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [us3.e] */
    /* JADX WARN: Type inference failed for: r4v6, types: [us3.e] */
    public void a(boolean z17) {
        java.util.List list;
        ?? Bi = us3.e.Ai().Bi();
        if (Bi == 0 || Bi.isEmpty()) {
            Bi = new java.util.ArrayList();
            vs3.a Di = us3.e.Di();
            if (Di != null) {
                Bi.add(Di);
                us3.e.Ai().wi(Di);
            }
        } else {
            java.lang.String str = (java.lang.String) gm0.j1.u().c().l(6, null);
            for (int i17 = 0; i17 < Bi.size(); i17++) {
                vs3.a aVar = (vs3.a) Bi.get(i17);
                boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f521408a);
                java.lang.String str2 = aVar.f521408a;
                if (!K0 && str2.equals(str)) {
                    boolean K02 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f521409b);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.p1980x300cc4.ViewOnFocusChangeListenerC16962x770823dd viewOnFocusChangeListenerC16962x770823dd = this.f530716c;
                    if (K02 || !aVar.f521409b.equals(viewOnFocusChangeListenerC16962x770823dd.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.kxw))) {
                        aVar.f521409b = viewOnFocusChangeListenerC16962x770823dd.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.kxw);
                        us3.e.Ai().Ni(Bi);
                    }
                } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f521409b) && (list = this.f530714a) != null) {
                    java.util.Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        java.lang.String[] strArr = (java.lang.String[]) it.next();
                        if (str2.equals(vs3.b.a(strArr[2]))) {
                            java.lang.String str3 = strArr[1];
                            aVar.f521409b = str3;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CommonHintViewConfig", "add name: %s", str3);
                            break;
                        }
                    }
                    us3.e.Ai().Ni(Bi);
                }
            }
        }
        ws3.y yVar = this.f530717d;
        synchronized (yVar) {
            yVar.f530732f = Bi;
            yVar.notifyDataSetChanged();
        }
        if (Bi.size() <= 0 || !z17) {
            return;
        }
        vs3.a aVar2 = (vs3.a) Bi.get(0);
        this.f530715b = aVar2;
        b(aVar2);
    }

    public void b(vs3.a aVar) {
        this.f530715b = aVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.p1980x300cc4.ViewOnFocusChangeListenerC16962x770823dd viewOnFocusChangeListenerC16962x770823dd = this.f530716c;
        if (aVar == null) {
            viewOnFocusChangeListenerC16962x770823dd.m67842xd454f3ba().setText("");
            viewOnFocusChangeListenerC16962x770823dd.m67853x310592d0().setText("");
            return;
        }
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(viewOnFocusChangeListenerC16962x770823dd.m67852xfb85ada3());
        java.lang.String str = aVar.f521408a;
        if (K0 || !viewOnFocusChangeListenerC16962x770823dd.m67852xfb85ada3().equals(str)) {
            viewOnFocusChangeListenerC16962x770823dd.m67842xd454f3ba().setText(vs3.b.b(str));
        }
        viewOnFocusChangeListenerC16962x770823dd.m67842xd454f3ba().setSelection(viewOnFocusChangeListenerC16962x770823dd.m67842xd454f3ba().getText().length());
        android.content.Context context = viewOnFocusChangeListenerC16962x770823dd.getContext();
        vs3.a aVar2 = this.f530715b;
        int i17 = aVar2.f521411d;
        if (i17 == 3) {
            viewOnFocusChangeListenerC16962x770823dd.m67853x310592d0().setText(this.f530715b.f521409b);
            viewOnFocusChangeListenerC16962x770823dd.m67853x310592d0().setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a2e));
            return;
        }
        if (i17 == 1) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar2.f521409b)) {
                java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kxx);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f530715b.f521410c)) {
                    string = string + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kxp, this.f530715b.f521410c);
                }
                viewOnFocusChangeListenerC16962x770823dd.m67853x310592d0().setText(string);
                viewOnFocusChangeListenerC16962x770823dd.m67853x310592d0().setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a28));
                return;
            }
            vs3.a aVar3 = this.f530715b;
            java.lang.String str2 = aVar3.f521409b;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar3.f521410c)) {
                str2 = str2 + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kxp, this.f530715b.f521410c);
            }
            viewOnFocusChangeListenerC16962x770823dd.m67853x310592d0().setText(str2);
            viewOnFocusChangeListenerC16962x770823dd.m67853x310592d0().setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
            return;
        }
        if (i17 == 2) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar2.f521410c)) {
                viewOnFocusChangeListenerC16962x770823dd.m67853x310592d0().setText("");
                viewOnFocusChangeListenerC16962x770823dd.m67853x310592d0().setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a28));
                return;
            } else {
                viewOnFocusChangeListenerC16962x770823dd.m67853x310592d0().setText(this.f530715b.f521410c);
                viewOnFocusChangeListenerC16962x770823dd.m67853x310592d0().setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
                return;
            }
        }
        if (i17 == 0) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar2.f521410c)) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f530715b.f521409b)) {
                    viewOnFocusChangeListenerC16962x770823dd.m67853x310592d0().setText("");
                    viewOnFocusChangeListenerC16962x770823dd.m67853x310592d0().setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
                    return;
                } else {
                    viewOnFocusChangeListenerC16962x770823dd.m67853x310592d0().setText(this.f530715b.f521409b);
                    viewOnFocusChangeListenerC16962x770823dd.m67853x310592d0().setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a28));
                    return;
                }
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f530715b.f521409b)) {
                viewOnFocusChangeListenerC16962x770823dd.m67853x310592d0().setText(this.f530715b.f521410c);
                viewOnFocusChangeListenerC16962x770823dd.m67853x310592d0().setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
                return;
            }
            viewOnFocusChangeListenerC16962x770823dd.m67853x310592d0().setText(this.f530715b.f521409b + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kxp, this.f530715b.f521410c));
            viewOnFocusChangeListenerC16962x770823dd.m67853x310592d0().setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a28));
        }
    }
}
