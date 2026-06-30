package al2;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f5839a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5840b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f5841c;

    /* renamed from: d, reason: collision with root package name */
    public final r45.z42 f5842d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.jg1 f5843e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f5844f;

    public g(int i17, int i18, java.util.LinkedList linkedList, r45.z42 z42Var, r45.jg1 jg1Var, java.lang.String str, int i19, kotlin.jvm.internal.i iVar) {
        linkedList = (i19 & 4) != 0 ? null : linkedList;
        z42Var = (i19 & 8) != 0 ? null : z42Var;
        jg1Var = (i19 & 16) != 0 ? null : jg1Var;
        str = (i19 & 32) != 0 ? "" : str;
        this.f5839a = i17;
        this.f5840b = i18;
        this.f5841c = linkedList;
        this.f5842d = z42Var;
        this.f5843e = jg1Var;
        this.f5844f = str;
    }
}
