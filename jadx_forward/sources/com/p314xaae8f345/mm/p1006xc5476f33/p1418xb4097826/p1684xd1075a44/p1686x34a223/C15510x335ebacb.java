package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1686x34a223;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/finder/widget/pref/FinderProtectHintPreference;", "Lcom/tencent/mm/ui/base/preference/Preference;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.widget.pref.FinderProtectHintPreference */
/* loaded from: classes.dex */
public final class C15510x335ebacb extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public boolean L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15510x335ebacb(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.edz;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(android.R.id.title);
        android.content.Context context = this.f279303d;
        if (textView != null) {
            java.lang.CharSequence charSequence = this.f279307h;
            if (charSequence != null) {
                if (!(charSequence.length() == 0)) {
                    textView.setVisibility(0);
                    textView.setText(charSequence);
                    textView.setTextSize(0, i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561161b3) * i65.a.m(context));
                }
            }
            textView.setVisibility(8);
        }
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.uvd);
        android.widget.TextView textView3 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.uvc);
        float f17 = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561161b3) * i65.a.m(context);
        if (!this.L) {
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            if (textView3 == null) {
                return;
            }
            textView3.setVisibility(8);
            return;
        }
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        if (textView2 != null) {
            textView2.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nzz));
        }
        if (textView2 != null) {
            textView2.setTextSize(0, f17);
        }
        if (textView3 != null) {
            textView3.setVisibility(0);
        }
        if (textView3 != null) {
            textView3.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.p4r));
        }
        if (textView3 != null) {
            textView3.setTextSize(0, f17);
        }
        if (textView3 != null) {
            textView3.setOnClickListener(new sy2.b(this));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15510x335ebacb(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.edz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15510x335ebacb(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.edz;
    }
}
