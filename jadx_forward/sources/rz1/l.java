package rz1;

/* loaded from: classes3.dex */
public class l implements ly1.a {
    public l(com.tencent.mm.plugin.datareport.sample.SampleUI sampleUI) {
    }

    @Override // ly1.a
    public java.util.Map b(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (u46.l.c(str, "btn2_click")) {
            hashMap.put("btn2_dynamicparams", "控件动态参数");
        }
        return hashMap;
    }
}
