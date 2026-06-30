package ca4;

/* loaded from: classes4.dex */
public class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f40013a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f40014b;

    /* renamed from: c, reason: collision with root package name */
    public int f40015c;

    public s0(r45.jj4 jj4Var) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f40013a = linkedList;
        linkedList.add(jj4Var);
    }

    public int a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDecodeType", "com.tencent.mm.plugin.sns.data.SnsDecodeElment");
        int i17 = this.f40015c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDecodeType", "com.tencent.mm.plugin.sns.data.SnsDecodeElment");
        return i17;
    }

    public java.util.List b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaList", "com.tencent.mm.plugin.sns.data.SnsDecodeElment");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaList", "com.tencent.mm.plugin.sns.data.SnsDecodeElment");
        return this.f40013a;
    }

    public java.lang.String c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRequestId", "com.tencent.mm.plugin.sns.data.SnsDecodeElment");
        java.lang.String str = this.f40014b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRequestId", "com.tencent.mm.plugin.sns.data.SnsDecodeElment");
        return str;
    }

    public void d(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDecodeType", "com.tencent.mm.plugin.sns.data.SnsDecodeElment");
        this.f40015c = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDecodeType", "com.tencent.mm.plugin.sns.data.SnsDecodeElment");
    }

    public void e(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRequestId", "com.tencent.mm.plugin.sns.data.SnsDecodeElment");
        this.f40014b = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRequestId", "com.tencent.mm.plugin.sns.data.SnsDecodeElment");
    }

    public s0(java.util.List list) {
        this.f40013a = new java.util.LinkedList();
        this.f40013a = list;
    }
}
