package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes8.dex */
public final class po extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI31 f110430d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.CheckBoxPreference f110431e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po(com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI31 occupyFinderUI31, com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference) {
        super(0);
        this.f110430d = occupyFinderUI31;
        this.f110431e = checkBoxPreference;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI31 occupyFinderUI31 = this.f110430d;
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = occupyFinderUI31.f109610e;
        kotlin.jvm.internal.o.d(checkBoxPreference);
        checkBoxPreference.O(!this.f110431e.N());
        ((com.tencent.mm.ui.base.preference.h0) occupyFinderUI31.getPreferenceScreen()).notifyDataSetChanged();
        return jz5.f0.f302826a;
    }
}
