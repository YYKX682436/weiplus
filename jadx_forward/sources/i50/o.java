package i50;

/* loaded from: classes9.dex */
public interface o extends i95.m {
    static i50.m G3(i50.o oVar, java.lang.String id6, java.lang.String title, java.lang.String desc, java.util.Map map, java.lang.String str, android.graphics.drawable.Drawable drawable, int i17, boolean z17, boolean z18, yz5.l lVar, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createForceNotifyCommonItem");
        }
        java.util.Map extraParams = (i18 & 8) != 0 ? new java.util.HashMap() : map;
        java.lang.String str2 = (i18 & 16) != 0 ? null : str;
        android.graphics.drawable.Drawable drawable2 = (i18 & 32) != 0 ? null : drawable;
        int i19 = (i18 & 64) != 0 ? 0 : i17;
        boolean z19 = (i18 & 128) != 0 ? true : z17;
        boolean z27 = (i18 & 256) != 0 ? true : z18;
        yz5.l lVar2 = (i18 & 512) != 0 ? null : lVar;
        ((h50.i) oVar).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraParams, "extraParams");
        return new i13.h(id6, title, desc, extraParams, i19, str2, drawable2, z19, z27, lVar2);
    }
}
