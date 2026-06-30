package e43;

/* loaded from: classes4.dex */
public abstract class f {
    public static final boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15717x73bbc431 org2, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15717x73bbc431 channelInfo) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(org2, "org");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(channelInfo, "channelInfo");
        if (org2.f36476xac2dee95 == channelInfo.f36476xac2dee95) {
            java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15716x8f4414e3> linkedList = org2.f36475xfb26965a;
            if (linkedList != null && linkedList.size() == channelInfo.f36475xfb26965a.size()) {
                java.util.Iterator<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15716x8f4414e3> it = channelInfo.f36475xfb26965a.iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15716x8f4414e3 next = it.next();
                    java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15716x8f4414e3> channel_list = org2.f36475xfb26965a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(channel_list, "channel_list");
                    java.util.Iterator<T> it6 = channel_list.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it6.next();
                        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15716x8f4414e3) obj).f36470x8cea31d7 == next.f36470x8cea31d7) {
                            break;
                        }
                    }
                    if (obj == null) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
