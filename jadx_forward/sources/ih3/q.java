package ih3;

/* loaded from: classes8.dex */
public abstract class q {
    public java.lang.String b(java.util.Map map, java.lang.String str) {
        int i17 = 0;
        while (true) {
            java.lang.String str2 = ".sysmsg.sysmsgtemplate.content_template.link_list.link";
            if (i17 != 0) {
                str2 = ".sysmsg.sysmsgtemplate.content_template.link_list.link" + i17;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) map.get(str2))) {
                return null;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0((java.lang.String) map.get(str2 + ".$type"), str)) {
                return str2;
            }
            i17++;
        }
    }

    public abstract void c(java.lang.String str, java.util.Map map, android.os.Bundle bundle, java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2);

    public void qf(java.lang.String str, java.util.Map map, android.os.Bundle bundle, java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2) {
        if (map == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SysMsgTemp.SysMsgTemplateReceivedHandlerBase", "hy: non map!!");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SysMsgTemp.SysMsgTemplateReceivedHandlerBase", "onClickLink linkType:%s", str);
            c(str, map, bundle, weakReference, weakReference2);
        }
    }
}
