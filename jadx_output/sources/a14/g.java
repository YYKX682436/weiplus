package a14;

/* loaded from: classes8.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    public static a14.g f608b;

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.autogen.mmdata.rpt.MultiMessageForwardStruct f609a;

    public g() {
        this.f609a = null;
        this.f609a = new com.tencent.mm.autogen.mmdata.rpt.MultiMessageForwardStruct();
    }

    public static a14.g a() {
        if (f608b == null) {
            f608b = new a14.g();
        }
        return f608b;
    }

    public boolean b() {
        c(2);
        com.tencent.mm.autogen.mmdata.rpt.MultiMessageForwardStruct multiMessageForwardStruct = this.f609a;
        multiMessageForwardStruct.f59346i = 1L;
        multiMessageForwardStruct.n();
        return multiMessageForwardStruct.k();
    }

    public void c(int i17) {
        com.tencent.mm.autogen.mmdata.rpt.MultiMessageForwardStruct multiMessageForwardStruct = this.f609a;
        multiMessageForwardStruct.f59341d = multiMessageForwardStruct.b("HasConfirmed", i17 + "", true);
    }
}
