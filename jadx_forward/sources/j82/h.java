package j82;

/* loaded from: classes8.dex */
public class h extends com.p314xaae8f345.p3210x3857dc.h1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.p1412xa3b20de3.ui.ActivityC13547xa84d1ae5 f379690a;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.fav.p1412xa3b20de3.ui.ActivityC13547xa84d1ae5 activityC13547xa84d1ae5) {
        this.f379690a = activityC13547xa84d1ae5;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.h1
    public void n(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        if (c27816xac2547f9 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.p1412xa3b20de3.ui.ActivityC13547xa84d1ae5 activityC13547xa84d1ae5 = this.f379690a;
            if (activityC13547xa84d1ae5.f181793i) {
                c27816xac2547f9.mo14660x738236e6("javascript:function setJsAcion(){document.querySelectorAll('img').forEach(function(img){img.addEventListener('click',function(){window.java_obj.doImgPreview(img.src)}) });var div = document.createElement('div');\ndiv.innerHTML = '<div style=\"padding: 8px 16px 4px;background: #FFFFFF;\"><div style=\"padding:12px 16px;background: #F7F7F7;-webkit-border-radius:4px;border-radius:4px;color: rgba(0,0,0,.5);font-size:17px;line-height:1.4;\">当前网络不可用，正在使用离线模式阅读</div></div>';\nvar parentNode = document.getElementById('js_article');\nvar oldNode = document.getElementsByClassName('rich_media_inner')[0];\nparentNode.insertBefore(div.firstChild, oldNode);}", null);
                c27816xac2547f9.mo14660x738236e6("javascript:setJsAcion()", null);
                activityC13547xa84d1ae5.f181793i = false;
            }
        }
    }
}
