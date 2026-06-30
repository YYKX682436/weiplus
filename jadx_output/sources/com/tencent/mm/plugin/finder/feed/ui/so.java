package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes8.dex */
public final class so extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI31 f110545d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f110546e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public so(com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI31 occupyFinderUI31, java.lang.Boolean bool) {
        super(0);
        this.f110545d = occupyFinderUI31;
        this.f110546e = bool;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI31 occupyFinderUI31 = this.f110545d;
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = occupyFinderUI31.f109609d;
        kotlin.jvm.internal.o.d(checkBoxPreference);
        kotlin.jvm.internal.o.d(this.f110546e);
        checkBoxPreference.O(!r2.booleanValue());
        ((com.tencent.mm.ui.base.preference.h0) occupyFinderUI31.getPreferenceScreen()).notifyDataSetChanged();
        return jz5.f0.f302826a;
    }
}
