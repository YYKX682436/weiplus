package ut5;

/* loaded from: classes13.dex */
public abstract class e {

    /* renamed from: WHITE_LIST_CLASS_NAME */
    private static final java.lang.String f77241x4440471d = "com.tencent.shadow.dynamic.impl.WhiteList";

    /* renamed from: WHITE_LIST_FIELD_NAME */
    private static final java.lang.String f77242x77efb0db = "sWhiteList";

    /* renamed from: getCustomWhiteList */
    public abstract java.lang.String[] mo95588x273269c0();

    /* renamed from: loadWhiteList */
    public java.lang.String[] m170523xe1753221(com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25507x83693462 c25507x83693462) {
        return m170524xe1753221(c25507x83693462, f77241x4440471d, f77242x77efb0db);
    }

    /* renamed from: loadWhiteList */
    public java.lang.String[] m170524xe1753221(com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25507x83693462 c25507x83693462, java.lang.String str, java.lang.String str2) {
        java.lang.String[] strArr = null;
        try {
            strArr = (java.lang.String[]) ut5.d.a(c25507x83693462, getClass().getClassLoader()).loadClass(str).getDeclaredField(str2).get(null);
        } catch (java.lang.ClassNotFoundException unused) {
        } catch (java.lang.IllegalAccessException e17) {
            throw new java.lang.RuntimeException(e17);
        } catch (java.lang.NoSuchFieldException e18) {
            throw new java.lang.RuntimeException(e18);
        }
        if (strArr != null) {
            java.lang.String[] mo95588x273269c0 = mo95588x273269c0();
            int length = mo95588x273269c0.length;
            int length2 = strArr.length;
            java.lang.String[] strArr2 = new java.lang.String[length + length2];
            java.lang.System.arraycopy(mo95588x273269c0, 0, strArr2, 0, length);
            java.lang.System.arraycopy(strArr, 0, strArr2, length, length2);
            return strArr2;
        }
        return mo95588x273269c0();
    }
}
