package com.p314xaae8f345.mm.p648x55baa833.ui.p652xa8fcbcdb;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/tencent/mm/chatroom/ui/preference/StillNotifyMessageManagerFollowMemberPreference;", "Lcom/tencent/mm/ui/base/preference/Preference;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui-chatroom_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.chatroom.ui.preference.StillNotifyMessageManagerFollowMemberPreference */
/* loaded from: classes3.dex */
public final class C10384xdee394bd extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public android.view.View L;
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 M;
    public android.view.ViewGroup N;
    public final java.util.ArrayList P;
    public com.p314xaae8f345.mm.p2621x8fb0427b.a3 Q;
    public com.p314xaae8f345.mm.p648x55baa833.ui.r8 R;
    public yz5.a S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10384xdee394bd(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
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
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(followContacts, "followContacts");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StillNotifyMessageManagerFollowMemberPreference", "[updateData] followContacts: " + followContacts);
        java.util.ArrayList arrayList = this.P;
        arrayList.clear();
        arrayList.addAll(followContacts);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.M;
        if (c1163xf1deaba4 != null && (mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19()) != null) {
            mo7946xf939df19.m8146xced61ae5();
        }
        M();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        M();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        if (this.L == null) {
            android.view.View u17 = super.u(viewGroup);
            this.L = u17;
            android.view.View findViewById = u17.findViewById(com.p314xaae8f345.mm.R.id.ugy);
            android.view.ViewGroup viewGroup2 = findViewById instanceof android.view.ViewGroup ? (android.view.ViewGroup) findViewById : null;
            if (viewGroup2 != null) {
                viewGroup2.removeAllViews();
            }
            android.content.Context context = this.f279303d;
            android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.ek7, viewGroup2);
            android.view.View view = this.L;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = view != null ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) view.findViewById(com.p314xaae8f345.mm.R.id.gas) : null;
            this.M = c1163xf1deaba4;
            if (c1163xf1deaba4 != null) {
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d c22847x422a813d = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d(context);
                c22847x422a813d.Q(1);
                c1163xf1deaba4.mo7967x900dcbe1(c22847x422a813d);
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.M;
            if (c1163xf1deaba42 != null) {
                c1163xf1deaba42.mo7960x6cab2c8d(new tn.a(this.P, this.Q, this.R));
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = this.M;
            if (c1163xf1deaba43 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                in5.t0 t0Var = new in5.t0(context);
                t0Var.f374662c = in5.q.f374646d;
                t0Var.c(com.p314xaae8f345.mm.R.C30859x5a72f63.f77766x20e835);
                t0Var.b(com.p314xaae8f345.mm.R.C30859x5a72f63.f77766x20e835);
                t0Var.d(com.p314xaae8f345.mm.R.C30860x5b28f31.f561670pc);
                android.content.res.Resources resources = t0Var.f374661b;
                t0Var.f374664e = resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561258dh);
                t0Var.f374666g = resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj);
                c1163xf1deaba43.N(t0Var.a());
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StillNotifyMessageManagerFollowMemberPreference", "[onBindView] roomId mFollowMemberRv:" + this.M);
            android.view.View view2 = this.L;
            android.view.ViewGroup viewGroup3 = view2 != null ? (android.view.ViewGroup) view2.findViewById(com.p314xaae8f345.mm.R.id.dbd) : null;
            this.N = viewGroup3;
            if (viewGroup3 != null) {
                viewGroup3.setOnClickListener(new tn.b(this));
            }
        }
        return this.L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10384xdee394bd(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.P = new java.util.ArrayList();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10384xdee394bd(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.P = new java.util.ArrayList();
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
    }
}
