package jn2;

/* loaded from: classes10.dex */
public final class r0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f382208d;

    /* renamed from: e, reason: collision with root package name */
    public final gk2.e f382209e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f382210f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f382211g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Set f382212h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.p f382213i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.l f382214m;

    public r0(android.content.Context context, gk2.e liveData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        this.f382208d = context;
        this.f382209e = liveData;
        this.f382210f = new java.util.ArrayList();
        this.f382211g = new java.util.ArrayList();
        this.f382212h = new java.util.LinkedHashSet();
        zl2.q4.f555466a.R("FinderLiveAnchorSingSongEditPanelAdapter");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return ((java.util.ArrayList) this.f382210f).size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        jn2.p0 holder = (jn2.p0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        r45.z22 songInfo = (r45.z22) ((java.util.ArrayList) this.f382210f).get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songInfo, "songInfo");
        r45.by1 by1Var = songInfo.f473164h;
        r45.ay1 ay1Var = by1Var != null ? by1Var.f452676d : null;
        holder.f382197e.A(ay1Var != null ? ay1Var.f451884e : null, ay1Var != null ? ay1Var.f451886g : null, ay1Var != null ? ay1Var.f451887h : 0, ay1Var != null ? ay1Var.f451888i : null, songInfo.f473161e);
        jn2.r0 r0Var = holder.f382199g;
        mm2.j6 j6Var = (mm2.j6) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.m6) r0Var.f382209e.a(mm2.m6.class)).f410784s).mo144003x754a37bb();
        boolean b17 = j6Var instanceof mm2.i6 ? p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((mm2.i6) j6Var).f410674a.f473162f, songInfo.f473162f) : false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p1548x1e28afad.p1549xaf3f29eb.C14424xe21e01a c14424xe21e01a = holder.f382197e;
        android.view.View f201314w = c14424xe21e01a.getF201314w();
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b mo10749x89e0979c = c14424xe21e01a.mo10749x89e0979c();
        android.widget.TextView a17 = c14424xe21e01a.getA();
        android.content.Context context = r0Var.f382208d;
        if (b17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(f201314w, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongEditPanelAdapter$EditViewHolder", "updatePlayingState", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f201314w.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(f201314w, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongEditPanelAdapter$EditViewHolder", "updatePlayingState", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo10749x89e0979c.setVisibility(0);
            mo10749x89e0979c.g();
            a17.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560739su));
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(f201314w, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongEditPanelAdapter$EditViewHolder", "updatePlayingState", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f201314w.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(f201314w, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongEditPanelAdapter$EditViewHolder", "updatePlayingState", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo10749x89e0979c.setVisibility(8);
            mo10749x89e0979c.n();
            a17.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.abw));
        }
        java.lang.String str = songInfo.f473162f;
        holder.f382196d.setChecked(str != null ? r0Var.f382212h.contains(str) : false);
        holder.f3639x46306858.setOnClickListener(new jn2.n0(songInfo, r0Var, holder, i17));
        holder.f382198f.setOnTouchListener(new jn2.o0(r0Var, holder));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e8m, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new jn2.p0(this, inflate);
    }
}
