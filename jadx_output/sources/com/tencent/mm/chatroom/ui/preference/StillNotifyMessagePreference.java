package com.tencent.mm.chatroom.ui.preference;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/tencent/mm/chatroom/ui/preference/StillNotifyMessagePreference;", "Lcom/tencent/mm/ui/base/preference/Preference;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui-chatroom_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StillNotifyMessagePreference extends com.tencent.mm.ui.base.preference.Preference {
    public android.view.View L;
    public java.lang.String M;
    public com.tencent.mm.ui.widget.MMTextView N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StillNotifyMessagePreference(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void M() {
        java.lang.String str = this.M;
        if (str == null || r26.n0.N(str)) {
            com.tencent.mm.ui.widget.MMTextView mMTextView = this.N;
            if (mMTextView == null) {
                return;
            }
            mMTextView.setVisibility(8);
            return;
        }
        com.tencent.mm.ui.widget.MMTextView mMTextView2 = this.N;
        if (mMTextView2 != null) {
            mMTextView2.setVisibility(0);
        }
        com.tencent.mm.ui.widget.MMTextView mMTextView3 = this.N;
        if (mMTextView3 == null) {
            return;
        }
        mMTextView3.setText(this.M);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        this.N = (com.tencent.mm.ui.widget.MMTextView) view.findViewById(com.tencent.mm.R.id.va8);
        M();
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        if (this.L == null) {
            android.view.View u17 = super.u(viewGroup);
            android.view.View findViewById = u17.findViewById(com.tencent.mm.R.id.cgi);
            kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) findViewById;
            viewGroup2.removeAllViews();
            android.view.View.inflate(this.f197770d, com.tencent.mm.R.layout.ek6, viewGroup2);
            this.L = u17;
        }
        return this.L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StillNotifyMessagePreference(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StillNotifyMessagePreference(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.G = com.tencent.mm.R.layout.byv;
    }
}
