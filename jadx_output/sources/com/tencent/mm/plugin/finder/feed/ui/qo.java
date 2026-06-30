package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes8.dex */
public final class qo implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI31 f110465d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.CheckBoxPreference f110466e;

    public qo(com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI31 occupyFinderUI31, com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference) {
        this.f110465d = occupyFinderUI31;
        this.f110466e = checkBoxPreference;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.kh2 req = (r45.kh2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        if (ret.getInteger(1) != 0) {
            pm0.v.X(new com.tencent.mm.plugin.finder.feed.ui.po(this.f110465d, this.f110466e));
        }
    }
}
