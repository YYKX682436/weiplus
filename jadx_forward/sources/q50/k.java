package q50;

/* loaded from: classes.dex */
public final class k extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f441685d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f441686e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f441687f;

    public k(android.content.Context mContext, java.util.List memberAvatarList, java.util.List chatroomMemberList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mContext, "mContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(memberAvatarList, "memberAvatarList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatroomMemberList, "chatroomMemberList");
        this.f441685d = mContext;
        this.f441686e = memberAvatarList;
        this.f441687f = chatroomMemberList;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f441687f.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f441687f.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        if (view == null) {
            view = android.view.View.inflate(this.f441685d, com.p314xaae8f345.mm.R.C30864xbddafb2a.elu, null);
            view.setTag(new q50.j());
        }
        java.lang.Object tag = view.getTag();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.feature.forward.ui.PreviewProfileUI.ChatroomMemberAdapter.ViewHolder");
        q50.j jVar = (q50.j) tag;
        jVar.f441683a = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.bgw);
        jVar.f441684b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.bgz);
        if (i17 >= 0) {
            java.util.List list = this.f441687f;
            if (i17 < list.size()) {
                java.util.List list2 = this.f441686e;
                if (i17 < list2.size()) {
                    android.widget.ImageView imageView = jVar.f441683a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
                    imageView.setVisibility(0);
                    android.widget.TextView textView = jVar.f441684b;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
                    textView.setVisibility(0);
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(jVar.f441683a, (java.lang.String) list2.get(i17), null);
                    android.widget.TextView textView2 = jVar.f441684b;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView2);
                    textView2.setText((java.lang.CharSequence) list.get(i17));
                }
            }
        }
        return view;
    }
}
