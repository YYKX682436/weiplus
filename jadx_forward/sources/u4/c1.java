package u4;

/* loaded from: classes13.dex */
public class c1 {

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Class[] f505981b = {android.content.Context.class, android.util.AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final x.b f505982c = new x.b();

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f505983a;

    public c1(android.content.Context context) {
        this.f505983a = context;
    }

    public final java.lang.Object a(android.util.AttributeSet attributeSet, java.lang.Class cls, java.lang.String str) {
        java.lang.Object newInstance;
        java.lang.Class<? extends U> asSubclass;
        java.lang.String attributeValue = attributeSet.getAttributeValue(null, "class");
        if (attributeValue == null) {
            throw new android.view.InflateException(str + " tag must have a 'class' attribute");
        }
        try {
            x.b bVar = f505982c;
            synchronized (bVar) {
                java.lang.reflect.Constructor constructor = (java.lang.reflect.Constructor) bVar.m174751x4aabfc28(attributeValue, null);
                if (constructor == null && (asSubclass = this.f505983a.getClassLoader().loadClass(attributeValue).asSubclass(cls)) != 0) {
                    constructor = asSubclass.getConstructor(f505981b);
                    constructor.setAccessible(true);
                    bVar.put(attributeValue, constructor);
                }
                newInstance = constructor.newInstance(this.f505983a, attributeSet);
            }
            return newInstance;
        } catch (java.lang.Exception e17) {
            throw new android.view.InflateException("Could not instantiate " + cls + " class " + attributeValue, e17);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0215, code lost:
    
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 b(org.xmlpull.v1.XmlPullParser r17, android.util.AttributeSet r18, p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 r19) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.c1.b(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, androidx.transition.Transition):androidx.transition.Transition");
    }
}
