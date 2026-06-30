package j9;

/* loaded from: classes15.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f379795a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f379796b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f379797c = new java.util.LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public final android.text.SpannableStringBuilder f379798d = new android.text.SpannableStringBuilder();

    /* renamed from: e, reason: collision with root package name */
    public int f379799e;

    /* renamed from: f, reason: collision with root package name */
    public int f379800f;

    /* renamed from: g, reason: collision with root package name */
    public int f379801g;

    /* renamed from: h, reason: collision with root package name */
    public int f379802h;

    /* renamed from: i, reason: collision with root package name */
    public int f379803i;

    /* renamed from: j, reason: collision with root package name */
    public int f379804j;

    public b(int i17, int i18) {
        c(i17, i18);
    }

    public android.text.SpannableString a() {
        int i17;
        android.text.SpannableStringBuilder spannableStringBuilder = this.f379798d;
        int length = spannableStringBuilder.length();
        int i18 = 0;
        int i19 = 0;
        while (true) {
            java.util.List list = this.f379795a;
            if (i19 >= ((java.util.ArrayList) list).size()) {
                break;
            }
            spannableStringBuilder.setSpan(((java.util.ArrayList) list).get(i19), 0, length, 33);
            i19++;
        }
        while (true) {
            java.util.List list2 = this.f379796b;
            if (i18 >= ((java.util.ArrayList) list2).size()) {
                break;
            }
            j9.a aVar = (j9.a) ((java.util.ArrayList) list2).get(i18);
            int size = ((java.util.ArrayList) list2).size();
            int i27 = aVar.f379794c;
            if (i18 < size - i27) {
                i17 = ((j9.a) ((java.util.ArrayList) list2).get(i27 + i18)).f379793b;
            } else {
                i17 = length;
            }
            spannableStringBuilder.setSpan(aVar.f379792a, aVar.f379793b, i17, 33);
            i18++;
        }
        if (this.f379804j != -1) {
            spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), this.f379804j, length, 33);
        }
        return new android.text.SpannableString(spannableStringBuilder);
    }

    public boolean b() {
        return ((java.util.ArrayList) this.f379795a).isEmpty() && ((java.util.ArrayList) this.f379796b).isEmpty() && this.f379797c.isEmpty() && this.f379798d.length() == 0;
    }

    public void c(int i17, int i18) {
        this.f379795a.clear();
        this.f379796b.clear();
        this.f379797c.clear();
        this.f379798d.clear();
        this.f379799e = 15;
        this.f379800f = 0;
        this.f379801g = 0;
        this.f379802h = i17;
        this.f379803i = i18;
        this.f379804j = -1;
    }

    public void d(android.text.style.CharacterStyle characterStyle, int i17) {
        ((java.util.ArrayList) this.f379796b).add(new j9.a(characterStyle, this.f379798d.length(), i17));
    }

    /* renamed from: toString */
    public java.lang.String m140472x9616526c() {
        return this.f379798d.toString();
    }
}
