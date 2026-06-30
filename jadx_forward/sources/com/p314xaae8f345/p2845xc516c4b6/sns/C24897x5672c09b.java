package com.p314xaae8f345.p2845xc516c4b6.sns;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0019\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/tencent/pigeon/sns/SnsFlutterSelectLabelRsp;", "", "result", "", "labelList", "", "Lcom/tencent/pigeon/sns/SnsFlutterLabelInfo;", "(ZLjava/util/List;)V", "getLabelList", "()Ljava/util/List;", "getResult", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toList", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.pigeon.sns.SnsFlutterSelectLabelRsp */
/* loaded from: classes11.dex */
public final /* data */ class C24897x5672c09b {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.p314xaae8f345.p2845xc516c4b6.sns.C24897x5672c09b.Companion INSTANCE = new com.p314xaae8f345.p2845xc516c4b6.sns.C24897x5672c09b.Companion(null);
    private final java.util.List<com.p314xaae8f345.p2845xc516c4b6.sns.C24894x9c0cde7e> labelList;
    private final boolean result;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/sns/SnsFlutterSelectLabelRsp$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/sns/SnsFlutterSelectLabelRsp;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.tencent.pigeon.sns.SnsFlutterSelectLabelRsp$Companion, reason: from kotlin metadata */
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
            this();
        }

        /* renamed from: fromList */
        public final com.p314xaae8f345.p2845xc516c4b6.sns.C24897x5672c09b m92198xb5cc5768(java.util.List<? extends java.lang.Object> list) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
            java.lang.Object obj2 = list.get(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.collections.List<com.tencent.pigeon.sns.SnsFlutterLabelInfo?>");
            return new com.p314xaae8f345.p2845xc516c4b6.sns.C24897x5672c09b(booleanValue, (java.util.List) obj2);
        }
    }

    public C24897x5672c09b(boolean z17, java.util.List<com.p314xaae8f345.p2845xc516c4b6.sns.C24894x9c0cde7e> labelList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(labelList, "labelList");
        this.result = z17;
        this.labelList = labelList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy$default */
    public static /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.sns.C24897x5672c09b m92188x75149012(com.p314xaae8f345.p2845xc516c4b6.sns.C24897x5672c09b c24897x5672c09b, boolean z17, java.util.List list, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = c24897x5672c09b.result;
        }
        if ((i17 & 2) != 0) {
            list = c24897x5672c09b.labelList;
        }
        return c24897x5672c09b.m92191x2eaf75(z17, list);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getResult() {
        return this.result;
    }

    /* renamed from: component2 */
    public final java.util.List<com.p314xaae8f345.p2845xc516c4b6.sns.C24894x9c0cde7e> m92190xe55482d5() {
        return this.labelList;
    }

    /* renamed from: copy */
    public final com.p314xaae8f345.p2845xc516c4b6.sns.C24897x5672c09b m92191x2eaf75(boolean result, java.util.List<com.p314xaae8f345.p2845xc516c4b6.sns.C24894x9c0cde7e> labelList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(labelList, "labelList");
        return new com.p314xaae8f345.p2845xc516c4b6.sns.C24897x5672c09b(result, labelList);
    }

    /* renamed from: equals */
    public boolean m92192xb2c87fbf(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.p314xaae8f345.p2845xc516c4b6.sns.C24897x5672c09b)) {
            return false;
        }
        com.p314xaae8f345.p2845xc516c4b6.sns.C24897x5672c09b c24897x5672c09b = (com.p314xaae8f345.p2845xc516c4b6.sns.C24897x5672c09b) other;
        return this.result == c24897x5672c09b.result && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.labelList, c24897x5672c09b.labelList);
    }

    /* renamed from: getLabelList */
    public final java.util.List<com.p314xaae8f345.p2845xc516c4b6.sns.C24894x9c0cde7e> m92193xdb307afc() {
        return this.labelList;
    }

    /* renamed from: getResult */
    public final boolean m92194x2d64eb13() {
        return this.result;
    }

    /* renamed from: hashCode */
    public int m92195x8cdac1b() {
        return (java.lang.Boolean.hashCode(this.result) * 31) + this.labelList.hashCode();
    }

    /* renamed from: toList */
    public final java.util.List<java.lang.Object> m92196xcc327db9() {
        return kz5.c0.i(java.lang.Boolean.valueOf(this.result), this.labelList);
    }

    /* renamed from: toString */
    public java.lang.String m92197x9616526c() {
        return "SnsFlutterSelectLabelRsp(result=" + this.result + ", labelList=" + this.labelList + ')';
    }
}
