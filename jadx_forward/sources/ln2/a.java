package ln2;

/* loaded from: classes3.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static java.lang.String b(ln2.a aVar, android.content.Context context, int i17, java.lang.String targetCount, java.lang.String performanceName, java.lang.String defaultString, int i18, java.lang.Object obj) {
        if ((i18 & 16) != 0) {
            defaultString = "";
        }
        aVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetCount, "targetCount");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(performanceName, "performanceName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(defaultString, "defaultString");
        if (i17 == 1) {
            defaultString = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.osq, targetCount);
        } else if (i17 == 2) {
            defaultString = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.osi, targetCount);
        } else if (i17 == 3) {
            defaultString = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.osy, targetCount);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("InteractionWishDataHelper", "getInteractionTypeDescTextWithPerformanceName: unknown interactionType=" + i17 + ", using defaultString=\"" + defaultString + '\"');
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(defaultString);
        if (!(performanceName.length() > 0)) {
            return defaultString;
        }
        return defaultString + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.osp, performanceName);
    }

    public final boolean a(r45.c04 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        return data.m75942xfb822ef2(1) > 0 && data.m75942xfb822ef2(0) > ((long) 0) && data.m75942xfb822ef2(0) <= ((long) 3);
    }

    public final int c(int i17, int i18) {
        if (i17 == 1) {
            return com.p314xaae8f345.mm.R.raw.f79297xeb90d885;
        }
        if (i17 == 2) {
            return com.p314xaae8f345.mm.R.raw.f78714x34310075;
        }
        if (i17 == 3) {
            return com.p314xaae8f345.mm.R.raw.f81036xd95291c2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("InteractionWishDataHelper", "getInteractionTypeIconResId: unknown interactionType=" + i17 + ", using defaultResId=" + i18);
        return i18;
    }
}
