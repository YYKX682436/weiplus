package bz0;

/* loaded from: classes5.dex */
public abstract class k {
    public static final void a(com.tencent.mm.autogen.mmdata.rpt.MaasSdkResStruct maasSdkResStruct, boolean z17) {
        kotlin.jvm.internal.o.g(maasSdkResStruct, "<this>");
        maasSdkResStruct.f59005f = z17 ? 1 : 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSdkResReport", "reportResult: " + maasSdkResStruct.n());
        maasSdkResStruct.k();
    }
}
