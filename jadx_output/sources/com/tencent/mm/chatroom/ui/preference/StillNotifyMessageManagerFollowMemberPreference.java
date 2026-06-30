package com.tencent.mm.chatroom.ui.preference;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/tencent/mm/chatroom/ui/preference/StillNotifyMessageManagerFollowMemberPreference;", "Lcom/tencent/mm/ui/base/preference/Preference;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui-chatroom_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class StillNotifyMessageManagerFollowMemberPreference extends com.tencent.mm.ui.base.preference.Preference {
    public android.view.View L;
    public androidx.recyclerview.widget.RecyclerView M;
    public android.view.ViewGroup N;
    public final java.util.ArrayList P;
    public com.tencent.mm.storage.a3 Q;
    public com.tencent.mm.chatroom.ui.r8 R;
    public yz5.a S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StillNotifyMessageManagerFollowMemberPreference(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.P = new java.util.ArrayList();
    }

    public final void M() {
        if (this.P.size() >= 4) {
            android.view.ViewGroup viewGroup = this.N;
            if (viewGroup == null) {
                return;
            }
            viewGroup.setVisibility(8);
            return;
        }
        android.view.ViewGroup viewGroup2 = this.N;
        if (viewGroup2 == null) {
            return;
        }
        viewGroup2.setVisibility(0);
    }

    public final void N(java.util.List followContacts) {
        androidx.recyclerview.widget.f2 adapter;
        kotlin.jvm.internal.o.g(followContacts, "followContacts");
        com.tencent.mars.xlog.Log.i("MicroMsg.StillNotifyMessageManagerFollowMemberPreference", "[updateData] followContacts: " + followContacts);
        java.util.ArrayList arrayList = this.P;
        arrayList.clear();
        arrayList.addAll(followContacts);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.M;
        if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null) {
            adapter.notifyDataSetChanged();
        }
        M();
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        M();
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        if (this.L == null) {
            android.view.View u17 = super.u(viewGroup);
            this.L = u17;
            android.view.View findViewById = u17.findViewById(com.tencent.mm.R.id.ugy);
            android.view.ViewGroup viewGroup2 = findViewById instanceof android.view.ViewGroup ? (android.view.ViewGroup) findViewById : null;
            if (viewGroup2 != null) {
                viewGroup2.removeAllViews();
            }
            android.content.Context context = this.f197770d;
            android.view.View.inflate(context, com.tencent.mm.R.layout.ek7, viewGroup2);
            android.view.View view = this.L;
            androidx.recyclerview.widget.RecyclerView recyclerView = view != null ? (androidx.recyclerview.widget.RecyclerView) view.findViewById(com.tencent.mm.R.id.gas) : null;
            this.M = recyclerView;
            if (recyclerView != null) {
                com.tencent.mm.view.recyclerview.WxLinearLayoutManager wxLinearLayoutManager = new com.tencent.mm.view.recyclerview.WxLinearLayoutManager(context);
                wxLinearLayoutManager.Q(1);
                recyclerView.setLayoutManager(wxLinearLayoutManager);
            }
            androidx.recyclerview.widget.RecyclerView recyclerView2 = this.M;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(new tn.a(this.P, this.Q, this.R));
            }
            androidx.recyclerview.widget.RecyclerView recyclerView3 = this.M;
            if (recyclerView3 != null) {
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                in5.t0 t0Var = new in5.t0(context);
                t0Var.f293129c = in5.q.f293113d;
                t0Var.c(com.tencent.mm.R.color.FG_3);
                t0Var.b(com.tencent.mm.R.color.FG_3);
                t0Var.d(com.tencent.mm.R.dimen.f480137pc);
                android.content.res.Resources resources = t0Var.f293128b;
                t0Var.f293131e = resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f479725dh);
                t0Var.f293133g = resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f479727dj);
                recyclerView3.N(t0Var.a());
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.StillNotifyMessageManagerFollowMemberPreference", "[onBindView] roomId mFollowMemberRv:" + this.M);
            android.view.View view2 = this.L;
            android.view.ViewGroup viewGroup3 = view2 != null ? (android.view.ViewGroup) view2.findViewById(com.tencent.mm.R.id.dbd) : null;
            this.N = viewGroup3;
            if (viewGroup3 != null) {
                viewGroup3.setOnClickListener(new tn.b(this));
            }
        }
        return this.L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StillNotifyMessageManagerFollowMemberPreference(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.P = new java.util.ArrayList();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StillNotifyMessageManagerFollowMemberPreference(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.P = new java.util.ArrayList();
        this.G = com.tencent.mm.R.layout.byv;
    }
}
