package lo2;

/* loaded from: classes2.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14480x353d0a05 f401663d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.f f401664e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14480x353d0a05 activityC14480x353d0a05, com.p314xaae8f345.mm.p944x882e457a.f fVar) {
        super(0);
        this.f401663d = activityC14480x353d0a05;
        this.f401664e = fVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.LinkedList linkedList = ((r45.bs0) this.f401664e.f152151d).f452552d;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14480x353d0a05.B;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14480x353d0a05 activityC14480x353d0a05 = this.f401663d;
        activityC14480x353d0a05.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fans contact ");
        sb6.append(linkedList != null ? java.lang.Integer.valueOf(linkedList.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMemberFanListUI", sb6.toString());
        java.util.ArrayList arrayList = activityC14480x353d0a05.f202928y;
        if (linkedList != null) {
            arrayList.addAll(linkedList);
            lo2.g gVar = activityC14480x353d0a05.f202927x;
            gVar.getClass();
            java.util.ArrayList arrayList2 = gVar.f401656e;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            gVar.notifyDataSetChanged();
        }
        int size = arrayList.size();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMemberFanListUI", "update title %s", java.lang.Integer.valueOf(size));
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMemberFanListUI", "update title %s", f0Var);
        if (size == 0) {
            activityC14480x353d0a05.mo54450xbf7c1df6(activityC14480x353d0a05.getString(com.p314xaae8f345.mm.R.C30867xcad56011.elg));
        } else {
            activityC14480x353d0a05.mo54450xbf7c1df6(activityC14480x353d0a05.getString(com.p314xaae8f345.mm.R.C30867xcad56011.em6, java.lang.Integer.valueOf(size)));
        }
        if (size == 0) {
            android.widget.TextView textView = activityC14480x353d0a05.f202926w;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emptyTip");
                throw null;
            }
            textView.setVisibility(0);
            android.widget.TextView textView2 = activityC14480x353d0a05.f202926w;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emptyTip");
                throw null;
            }
            textView2.setText(activityC14480x353d0a05.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cug));
        } else {
            android.widget.TextView textView3 = activityC14480x353d0a05.f202926w;
            if (textView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emptyTip");
                throw null;
            }
            textView3.setVisibility(8);
        }
        return f0Var;
    }
}
