package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030;

/* loaded from: classes12.dex */
public final class s3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedHashMap f149202d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(java.util.LinkedHashMap linkedHashMap) {
        super(2);
        this.f149202d = linkedHashMap;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String proc = (java.lang.String) obj;
        android.app.ApplicationExitInfo exitInfo = (android.app.ApplicationExitInfo) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(proc, "proc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exitInfo, "exitInfo");
        java.lang.String concat = proc.concat("Reason");
        java.lang.Integer valueOf = java.lang.Integer.valueOf(exitInfo.getReason());
        java.util.LinkedHashMap linkedHashMap = this.f149202d;
        linkedHashMap.put(concat, valueOf);
        linkedHashMap.put(proc.concat("SubReason"), dr0.t3.a(exitInfo));
        linkedHashMap.put(proc.concat("Status"), java.lang.Integer.valueOf(exitInfo.getStatus()));
        java.lang.String concat2 = proc.concat("Description");
        java.lang.String description = exitInfo.getDescription();
        if (description == null) {
            description = "null";
        }
        linkedHashMap.put(concat2, description);
        linkedHashMap.put(proc.concat("Importance"), java.lang.Integer.valueOf(exitInfo.getImportance()));
        long j17 = 1048576;
        linkedHashMap.put(proc.concat("Pss"), java.lang.Long.valueOf((exitInfo.getPss() << 10) / j17));
        linkedHashMap.put(proc.concat("Rss"), java.lang.Long.valueOf((exitInfo.getRss() << 10) / j17));
        linkedHashMap.put(proc.concat("TimeStamp"), java.lang.Long.valueOf(exitInfo.getTimestamp()));
        linkedHashMap.put(proc.concat("ExitInfo"), exitInfo.toString());
        return jz5.f0.f384359a;
    }
}
