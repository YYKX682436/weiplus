package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/UserRelationshipTagTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.UserRelationshipTagTextView */
/* loaded from: classes8.dex */
public final class C15385xab9dd69 extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f213141g = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15385xab9dd69(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ss tagType, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tagType, "tagType");
        switch (tagType.ordinal()) {
            case 1:
                if (str == null) {
                    str = getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f6n);
                }
                setText(str);
                setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.adj, null));
                return;
            case 2:
                if (str == null) {
                    str = getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f6l);
                }
                setText(str);
                setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m, null));
                return;
            case 3:
                if (str == null) {
                    str = getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f6m);
                }
                setText(str);
                setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m, null));
                return;
            case 4:
                if (str == null) {
                    str = "";
                }
                setText(str);
                setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834, null));
                return;
            case 5:
                if (str == null) {
                    str = getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cpv);
                }
                setText(str);
                setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m, null));
                return;
            case 6:
                if (str == null) {
                    str = "";
                }
                setText(str);
                setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m, null));
                return;
            default:
                setText("");
                return;
        }
    }

    public final void e(int i17) {
        java.lang.String string = getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573631lp1, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.i(i17));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ss.f214611g, string);
    }

    public final void g(int i17) {
        java.lang.String string = getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573632lp2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.i(i17));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ss.f214611g, string);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15385xab9dd69(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
