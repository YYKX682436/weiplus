package gm0;

/* loaded from: classes8.dex */
public class c0 implements com.p314xaae8f345.mm.vfs.b7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f354701a;

    public c0(gm0.d0 d0Var, java.lang.String str) {
        this.f354701a = str;
    }

    @Override // com.p314xaae8f345.mm.vfs.b7
    public boolean a(com.p314xaae8f345.mm.vfs.r6 r6Var, java.lang.String str) {
        java.lang.String str2 = this.f354701a;
        return str.startsWith(str2) && !str.equals(str2);
    }
}
