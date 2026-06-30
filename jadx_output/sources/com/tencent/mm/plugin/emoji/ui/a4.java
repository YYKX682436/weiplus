package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes12.dex */
public final class a4 extends m22.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmoticonNewPersonCenterManagerActivity f97895d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(com.tencent.mm.plugin.emoji.ui.EmoticonNewPersonCenterManagerActivity emoticonNewPersonCenterManagerActivity, android.content.Context context, int i17, int i18) {
        super(context, i17, i18);
        kotlin.jvm.internal.o.g(context, "context");
        this.f97895d = emoticonNewPersonCenterManagerActivity;
    }

    @Override // m22.j, m22.y
    public void a(m22.i item, int i17) {
        kotlin.jvm.internal.o.g(item, "item");
        super.a(item, i17);
        if (item instanceof m22.k) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("emo_album_index", java.lang.Integer.valueOf(i17));
            java.lang.String str = ((m22.k) item).f323054a.field_productID;
            kotlin.jvm.internal.o.f(str, "getProductID(...)");
            hashMap.put("pid", str);
            int i18 = com.tencent.mm.plugin.emoji.ui.EmoticonNewPersonCenterManagerActivity.f97868u;
            com.tencent.mm.plugin.emoji.ui.EmoticonNewPersonCenterManagerActivity emoticonNewPersonCenterManagerActivity = this.f97895d;
            emoticonNewPersonCenterManagerActivity.T6("emo_album_manage_page_remove_button", "view_clk", hashMap);
            emoticonNewPersonCenterManagerActivity.V6(true);
        }
    }
}
