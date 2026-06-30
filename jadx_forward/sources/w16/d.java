package w16;

/* loaded from: classes15.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f523785a;

    public d(java.lang.String str) {
        if (str != null) {
            this.f523785a = str;
        } else {
            a(5);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i17) {
        java.lang.String str = (i17 == 3 || i17 == 6 || i17 == 7 || i17 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i17 == 3 || i17 == 6 || i17 == 7 || i17 == 8) ? 2 : 3];
        switch (i17) {
            case 1:
                objArr[0] = "classId";
                break;
            case 2:
            case 4:
                objArr[0] = "fqName";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            case 5:
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i17 == 3) {
            objArr[1] = "byFqNameWithoutInnerClasses";
        } else if (i17 == 6) {
            objArr[1] = "getFqNameForClassNameWithoutDollars";
        } else if (i17 == 7) {
            objArr[1] = "getPackageFqName";
        } else if (i17 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
        } else {
            objArr[1] = "getInternalName";
        }
        switch (i17) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
            case 4:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                break;
            case 5:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i17 != 3 && i17 != 6 && i17 != 7 && i17 != 8) {
            throw new java.lang.IllegalArgumentException(format);
        }
        throw new java.lang.IllegalStateException(format);
    }

    public static w16.d b(n16.b bVar) {
        if (bVar == null) {
            a(1);
            throw null;
        }
        n16.c h17 = bVar.h();
        java.lang.String replace = bVar.i().b().replace('.', '$');
        if (h17.d()) {
            return new w16.d(replace);
        }
        return new w16.d(h17.b().replace('.', '/') + "/" + replace);
    }

    public static w16.d c(n16.c cVar) {
        if (cVar != null) {
            return new w16.d(cVar.b().replace('.', '/'));
        }
        a(2);
        throw null;
    }

    public static w16.d d(java.lang.String str) {
        if (str != null) {
            return new w16.d(str);
        }
        a(0);
        throw null;
    }

    public java.lang.String e() {
        java.lang.String str = this.f523785a;
        if (str != null) {
            return str;
        }
        a(8);
        throw null;
    }

    /* renamed from: equals */
    public boolean m173119xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w16.d.class != obj.getClass()) {
            return false;
        }
        return this.f523785a.equals(((w16.d) obj).f523785a);
    }

    /* renamed from: hashCode */
    public int m173120x8cdac1b() {
        return this.f523785a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m173121x9616526c() {
        return this.f523785a;
    }
}
