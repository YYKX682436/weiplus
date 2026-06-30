package ca4;

/* loaded from: classes4.dex */
public abstract class f1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ca4.e1 f39897a = new ca4.e1(null);

    public static final void a(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, java.lang.CharSequence charSequence) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkStyleAndReplaceClickSpanColor", "com.tencent.mm.plugin.sns.data.SnsUtilExt");
        f39897a.h(snsInfo, charSequence);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkStyleAndReplaceClickSpanColor", "com.tencent.mm.plugin.sns.data.SnsUtilExt");
    }

    public static final int b(com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject) {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAddressLinkColorResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt");
        ca4.e1 e1Var = f39897a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAddressLinkColorResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        if (xa4.g.f452830d.y(timeLineObject)) {
            xa4.g.t();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAddressLinkColorResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            i17 = com.tencent.mm.R.color.af9;
        } else {
            e1Var.r();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAddressLinkColorResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            i17 = com.tencent.mm.R.color.Link_100;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAddressLinkColorResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt");
        return i17;
    }

    public static final android.graphics.drawable.Drawable c(android.content.Context context, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCommentButtonIconDrawable", "com.tencent.mm.plugin.sns.data.SnsUtilExt");
        android.graphics.drawable.Drawable l17 = f39897a.l(context, timeLineObject);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentButtonIconDrawable", "com.tencent.mm.plugin.sns.data.SnsUtilExt");
        return l17;
    }

    public static final int d(com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDeleteIconColorResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt");
        int n17 = f39897a.n(timeLineObject);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDeleteIconColorResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt");
        return n17;
    }

    public static final int e(boolean z17) {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGalleryUILikeIconResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGalleryUILikeIconResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGalleryUILikeIconResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            i17 = com.tencent.mm.R.drawable.icon_soring_2024_firecracker_outlined;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGalleryUILikeIconResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            i17 = com.tencent.mm.R.raw.icons_outlined_like;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGalleryUILikeIconResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt");
        return i17;
    }

    public static final int f(com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGroupPermissionIconColorResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt");
        int p17 = f39897a.p(timeLineObject);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGroupPermissionIconColorResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt");
        return p17;
    }

    public static final android.graphics.drawable.Drawable g(android.content.Context context, int i17, int i18, int i19, boolean z17) {
        android.graphics.drawable.Drawable drawable;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLikeIconTextLeftDrawable", "com.tencent.mm.plugin.sns.data.SnsUtilExt");
        ca4.e1 e1Var = f39897a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLikeIconTextLeftDrawable", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        kotlin.jvm.internal.o.g(context, "context");
        int color = context.getResources().getColor(e1Var.m(z17));
        if (z17) {
            android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{xa4.g.s(color, i17, i18)});
            layerDrawable.setLayerInset(0, 0, 0, i19, 0);
            layerDrawable.setBounds(0, 0, i17 + i19, i18);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLikeIconTextLeftDrawable", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            drawable = layerDrawable;
        } else {
            android.graphics.drawable.Drawable e17 = com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.drawable.at7, color);
            if (e17 instanceof android.graphics.drawable.LayerDrawable) {
                ((android.graphics.drawable.LayerDrawable) e17).setLayerInset(0, 0, 0, i19, 0);
            }
            e17.setBounds(0, 0, i17 + i19, i18);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLikeIconTextLeftDrawable", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            drawable = e17;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLikeIconTextLeftDrawable", "com.tencent.mm.plugin.sns.data.SnsUtilExt");
        return drawable;
    }

    public static final int h(com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject) {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLinkSpanColor", "com.tencent.mm.plugin.sns.data.SnsUtilExt");
        ca4.e1 e1Var = f39897a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLinkSpanColor", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        boolean y17 = xa4.g.f452830d.y(timeLineObject);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLinkSpanColor", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        if (y17) {
            xa4.g.t();
            i17 = com.tencent.mm.R.color.af9;
        } else {
            e1Var.r();
            i17 = com.tencent.mm.R.color.Link_100;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLinkSpanColor", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLinkSpanColor", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLinkSpanColor", "com.tencent.mm.plugin.sns.data.SnsUtilExt");
        return i17;
    }

    public static final android.graphics.drawable.Drawable i(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17) {
        android.graphics.drawable.Drawable i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMsgContentBgDrawable", "com.tencent.mm.plugin.sns.data.SnsUtilExt");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMsgContentBgDrawable", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        if (snsInfo == null || !((i17 == 1 || i17 == 2) && com.tencent.mm.sdk.platformtools.t8.D0(snsInfo.getUserName(), com.tencent.mm.plugin.sns.model.l4.sj()) && xa4.g.x(snsInfo))) {
            i18 = i65.a.i(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.drawable.d76);
            kotlin.jvm.internal.o.f(i18, "getDrawable(...)");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMsgContentBgDrawable", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        } else {
            i18 = i65.a.i(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.drawable.d77);
            kotlin.jvm.internal.o.f(i18, "getDrawable(...)");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMsgContentBgDrawable", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMsgContentBgDrawable", "com.tencent.mm.plugin.sns.data.SnsUtilExt");
        return i18;
    }

    public static final int j(com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStarIconColorResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt");
        int t17 = f39897a.t(timeLineObject);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStarIconColorResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt");
        return t17;
    }

    public static final java.util.LinkedList k(java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stringListToSKBuiltinStringList", "com.tencent.mm.plugin.sns.data.SnsUtilExt");
        java.util.LinkedList v17 = f39897a.v(list);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stringListToSKBuiltinStringList", "com.tencent.mm.plugin.sns.data.SnsUtilExt");
        return v17;
    }
}
