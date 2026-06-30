package l2;

/* loaded from: classes14.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final l2.g f396650b = new l2.g(0);

    /* renamed from: c, reason: collision with root package name */
    public static final l2.g f396651c = new l2.g(1);

    /* renamed from: d, reason: collision with root package name */
    public static final l2.g f396652d = new l2.g(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f396653a;

    public g(int i17) {
        this.f396653a = i17;
    }

    public final boolean a(l2.g other) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        int i17 = other.f396653a;
        int i18 = this.f396653a;
        return (i17 | i18) == i18;
    }

    /* renamed from: equals */
    public boolean m144908xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l2.g) {
            return this.f396653a == ((l2.g) obj).f396653a;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m144909x8cdac1b() {
        return this.f396653a;
    }

    /* renamed from: toString */
    public java.lang.String m144910x9616526c() {
        int i17 = this.f396653a;
        if (i17 == 0) {
            return "TextDecoration.None";
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if ((i17 & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i17 & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((java.lang.String) arrayList.get(0));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("TextDecoration[");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append((java.lang.CharSequence) "");
        int size = arrayList.size();
        int i18 = 0;
        for (int i19 = 0; i19 < size; i19++) {
            java.lang.Object obj = arrayList.get(i19);
            i18++;
            if (i18 > 1) {
                sb7.append((java.lang.CharSequence) ", ");
            }
            if (obj == null ? true : obj instanceof java.lang.CharSequence) {
                sb7.append((java.lang.CharSequence) obj);
            } else if (obj instanceof java.lang.Character) {
                sb7.append(((java.lang.Character) obj).charValue());
            } else {
                sb7.append((java.lang.CharSequence) java.lang.String.valueOf(obj));
            }
        }
        sb7.append((java.lang.CharSequence) "");
        java.lang.String sb8 = sb7.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb8, "fastJoinTo(StringBuilder…form)\n        .toString()");
        sb6.append(sb8);
        sb6.append(']');
        return sb6.toString();
    }
}
