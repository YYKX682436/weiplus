package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB#\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabSearchFragment;", "Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment;", "", "getFeedFrom", "getType", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mv_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvTabSearchFragment */
/* loaded from: classes10.dex */
public final class C16703x9178fa1f extends com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.AbstractC16697x9da72997 {

    /* renamed from: w, reason: collision with root package name */
    public int f233264w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f233265x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f233266y;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C16703x9178fa1f(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.AbstractC16697x9da72997
    public void c(dm.i8 i8Var, java.lang.String str) {
        this.music = i8Var;
        this.keyword = str;
        if (this.f233266y == null) {
            this.f233266y = java.util.UUID.randomUUID().toString();
        }
        java.lang.String str2 = this.f233266y;
        if (str2 == null || str == null) {
            return;
        }
        java.lang.String str3 = str.length() > 0 ? str : null;
        if (str3 != null) {
            r45.qt2 qt2Var = new r45.qt2();
            qt2Var.set(5, 93);
            pm0.v.T(new bq.o1(str3, this.f233264w, str2, this.f233265x, 12, qt2Var, null, null, null, null, false, 0, 4032, null).l(), new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.b4(this));
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6775xb6999670 c17 = fm3.g0.f345603a.c();
            c17.f141024t = c17.b("KeyWord", str3, true);
            c17.f141025u = c17.b("ExpId", "", true);
            c17.f141015k = 3L;
            c17.k();
            c17.o();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.AbstractC16697x9da72997
    /* renamed from: getFeedFrom */
    public int mo67347x7063afde() {
        return 7;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.AbstractC16697x9da72997
    /* renamed from: getType */
    public int mo67358xfb85f7b0() {
        return 5;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.AbstractC16697x9da72997, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16703x9178fa1f(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        gm0.j1.d().a(3820, this);
    }
}
