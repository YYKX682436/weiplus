package p012xc85e97e9.p016x746ad0e3.app;

/* renamed from: androidx.appcompat.app.AppCompatViewInflater */
/* loaded from: classes15.dex */
public class C0068xf61c0d93 {

    /* renamed from: LOG_TAG */
    private static final java.lang.String f95x3f3d67df = "AppCompatViewInflater";

    /* renamed from: mConstructorArgs */
    private final java.lang.Object[] f100x5b9fbfca = new java.lang.Object[2];

    /* renamed from: sConstructorSignature */
    private static final java.lang.Class<?>[] f98x6492b6f1 = {android.content.Context.class, android.util.AttributeSet.class};

    /* renamed from: sOnClickAttrs */
    private static final int[] f99xc5cf834c = {android.R.attr.onClick};

    /* renamed from: sClassPrefixList */
    private static final java.lang.String[] f96x9eb0f5 = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: sConstructorMap */
    private static final java.util.Map<java.lang.String, java.lang.reflect.Constructor<? extends android.view.View>> f97x89742255 = new x.b();

    public final android.view.View a(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        java.util.Map<java.lang.String, java.lang.reflect.Constructor<? extends android.view.View>> map = f97x89742255;
        java.lang.reflect.Constructor<? extends android.view.View> constructor = map.get(str);
        if (constructor == null) {
            try {
                java.lang.ClassLoader classLoader = context.getClassLoader();
                if (str2 != null) {
                    str3 = str2 + str;
                } else {
                    str3 = str;
                }
                constructor = classLoader.loadClass(str3).asSubclass(android.view.View.class).getConstructor(f98x6492b6f1);
                map.put(str, constructor);
            } catch (java.lang.Exception unused) {
                return null;
            }
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.f100x5b9fbfca);
    }

    public final void b(android.view.View view, java.lang.String str) {
        if (view != null) {
            return;
        }
        throw new java.lang.IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    /* renamed from: createAutoCompleteTextView */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0079x7da3871d m2556x5f2d44b6(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0079x7da3871d(context, attributeSet);
    }

    /* renamed from: createButton */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0080x3ada79f5 mo2557x3e97074e(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0080x3ada79f5(context, attributeSet);
    }

    /* renamed from: createCheckBox */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0081x8bc951a6 m2558x9297ecbf(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0081x8bc951a6(context, attributeSet);
    }

    /* renamed from: createCheckedTextView */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0082x8e24ad6 m2559xd97cb19d(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0082x8e24ad6(context, attributeSet);
    }

    /* renamed from: createEditText */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0083x8fabc05a m2560x967a5b73(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0083x8fabc05a(context, attributeSet);
    }

    /* renamed from: createImageButton */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0084x6ce1fb8a m2561x91d4ddd1(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0084x6ce1fb8a(context, attributeSet);
    }

    /* renamed from: createImageView */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd m2562x74550d04(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd(context, attributeSet);
    }

    /* renamed from: createMultiAutoCompleteTextView */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0086x1cc7b0d0 m2563x51e18ad7(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0086x1cc7b0d0(context, attributeSet);
    }

    /* renamed from: createRadioButton */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0088xd308ee2a m2564xf7fbd071(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0088xd308ee2a(context, attributeSet);
    }

    /* renamed from: createRatingBar */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0089xea302393 m2565xbd34eb9a(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0089xea302393(context, attributeSet);
    }

    /* renamed from: createSeekBar */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0090x87990818 m2566xfb6e25df(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0090x87990818(context, attributeSet);
    }

    /* renamed from: createSpinner */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0091x9a98b7b6 m2567xe6dd57d(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0091x9a98b7b6(context, attributeSet);
    }

    /* renamed from: createTextView */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375 m2568xfb2bde8e(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375(context, attributeSet);
    }

    /* renamed from: createView */
    public android.view.View m2569x519d71c1(android.content.Context context, java.lang.String str, android.util.AttributeSet attributeSet) {
        return null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:33:0x01ae
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: createView */
    public final android.view.View m2570x519d71c1(android.view.View r3, java.lang.String r4, android.content.Context r5, android.util.AttributeSet r6, boolean r7, boolean r8, boolean r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p016x746ad0e3.app.C0068xf61c0d93.m2570x519d71c1(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet, boolean, boolean, boolean, boolean):android.view.View");
    }
}
