package lf2;

/* loaded from: classes10.dex */
public final class l extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f399827d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lf2.s f399828e;

    public l(android.content.Context context, lf2.s sVar) {
        this.f399827d = context;
        this.f399828e = sVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f399828e.e0().size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        r45.y34 y34Var;
        lf2.c holder = (lf2.c) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        lf2.s sVar = this.f399828e;
        java.lang.Object obj = sVar.e0().get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        lf2.b bVar = (lf2.b) obj;
        android.view.View view = holder.f399810e;
        int i18 = bVar.f399808b ? 0 : 4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/ktv/LiveKtvVoiceSettingPanel$mReverberationAdapter$2$1", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/ktv/LiveKtvVoiceSettingPanel$ReverberationItemViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/ktv/LiveKtvVoiceSettingPanel$mReverberationAdapter$2$1", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/ktv/LiveKtvVoiceSettingPanel$ReverberationItemViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        om2.m mVar = bVar.f399807a;
        java.lang.String str = mVar.f427890e;
        android.widget.TextView textView = holder.f399812g;
        textView.setText(str);
        com.p314xaae8f345.mm.ui.fk.a(textView);
        holder.f3639x46306858.setOnClickListener(new lf2.i(sVar, i17, this));
        android.widget.ImageView imageView = holder.f399811f;
        imageView.setImageDrawable(null);
        android.content.Context context = this.f399827d;
        textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        if (mVar != om2.m.f427885o) {
            java.util.LinkedHashMap linkedHashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.d2.f197011c;
            java.util.ArrayList arrayList2 = om2.n.f427892a;
            switch (mVar.ordinal()) {
                case 1:
                    y34Var = r45.y34.ReverbType_Studio;
                    break;
                case 2:
                    y34Var = r45.y34.ReverbType_Church;
                    break;
                case 3:
                    y34Var = r45.y34.ReverbType_Hall;
                    break;
                case 4:
                    y34Var = r45.y34.ReverbType_Room;
                    break;
                case 5:
                    y34Var = r45.y34.ReverbType_Origin;
                    break;
                case 6:
                    y34Var = r45.y34.ReverbType_Deepmusic;
                    break;
                case 7:
                    y34Var = r45.y34.ReverbType_Changjiang;
                    break;
                default:
                    y34Var = r45.y34.ReverbType_None;
                    break;
            }
            om2.b bVar2 = (om2.b) linkedHashMap.get(java.lang.Integer.valueOf(y34Var.ordinal()));
            if (bVar2 != null) {
                mn2.g1 g1Var = mn2.g1.f411508a;
                wo0.c b17 = g1Var.e().b(new mn2.q3(bVar2.f427806c, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), g1Var.h(mn2.f1.f411498s));
                lf2.k kVar = new lf2.k(holder, context);
                b17.getClass();
                b17.f529409g = kVar;
                b17.c(imageView);
            }
        }
        int i19 = mVar.f427891f;
        if (i19 > 0) {
            imageView.setImageDrawable(context.getResources().getDrawable(i19));
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f399827d).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.drj, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new lf2.c(inflate);
    }
}
